package com.loftlab.lib;

import com.google.auto.service.AutoService;
import com.loftlab.lib.anno.BindView;
import com.loftlab.lib.anno.ContentView;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

/**
 * Created by Administrator on 2017/8/16.
 */
@AutoService(Processor.class)
public class IocProcessor extends AbstractProcessor {
    private L l = new L();
    private Elements elements;
    /**
     * 保存要生成的注解文件信息
     */
    private Map<String, ProxyInfo> mProxyMap = new HashMap<>();

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        l.setMessager(processingEnv.getMessager());
        elements = processingEnv.getElementUtils();

        // 在这里打印gradle文件传进来的参数
        Map<String, String> map = processingEnv.getOptions();
        for (String key : map.keySet()) {
            l.d(key + " : " + map.get(key));
        }
    }

    /**
     * 此方法设置支持的注解类型，没有设置 无效 （获取不到）
     * @return
     */
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        HashSet<String> supportType = new HashSet<>();
        supportType.add(ContentView.class.getCanonicalName());
        supportType.add(BindView.class.getCanonicalName());
        return supportType;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        l.d("process...");
        mProxyMap.clear();

        //获取全部带有注BindView注解的Element
        Set<? extends Element> elementsWithBind = roundEnv.getElementsAnnotatedWith(BindView.class);
        //对BindView循环构建ProxyInfo信息
        for (Element element : elementsWithBind) {
            // 检查Element的合法性
            checkSAnnotationValid(element, BindView.class);
            // 强转成属性元素
            VariableElement variableElement = (VariableElement) element;
            // 已知属性元素外层一定是类元素
            TypeElement typeElement = (TypeElement) variableElement.getEnclosingElement();
            // 获取类元素的类名
            String qualifiedName = typeElement.getQualifiedName().toString();
            // 类名作为key， ProxyInfo作为值，保存到注解文件信息表中
            ProxyInfo info = mProxyMap.get(qualifiedName);
            if (null == info) {
                info = new ProxyInfo(elements, typeElement);
                mProxyMap.put(qualifiedName, info);
            }
            BindView bindAnnotation = element.getAnnotation(BindView.class);
            int id = bindAnnotation.value();
            info.injectVariables.put(id, variableElement);
        }
        // 获取所有的ContentView注解，操作原理和上面的BindView一样
        Set<? extends Element> contentAnnotation = roundEnv.getElementsAnnotatedWith(ContentView.class);
        for (Element element : contentAnnotation) {
            TypeElement typeElement = (TypeElement) element;
            String qualifiedName = typeElement.getQualifiedName().toString();
            ProxyInfo info = mProxyMap.get(qualifiedName);
            if (null == info) {
                info = new ProxyInfo(elements, typeElement);
                mProxyMap.put(qualifiedName, info);
            }
            ContentView contentViewAnnotation = element.getAnnotation(ContentView.class);
            info.contentViewid = contentViewAnnotation.value();
        }

        for (String key : mProxyMap.keySet()) {
            ProxyInfo info = mProxyMap.get(key);
            try {
                JavaFileObject jfo = processingEnv.getFiler().createSourceFile(info.getProxyClassFullName(), info.getTypeElement());
                Writer writer = jfo.openWriter();
                writer.write(info.generateJavaCode());
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean checkSAnnotationValid(Element element, Class<?> clazz) {
        if (element.getKind() != ElementKind.FIELD) {
            l.e(element, "%s must be declared on field", clazz.getSimpleName());
            return false;
        }
        if (ClassValidator.isPrivate(element)) {
            l.e(element, "%s() must can't be private", element.getSimpleName());
            return false;
        }
        return true;
    }

    static class L {
        private Messager messager;
        public void setMessager(Messager messager) {
            this.messager = messager;
        }
        public void d(CharSequence msg) {
            messager.printMessage(Diagnostic.Kind.NOTE, msg);
        }
        public void w(CharSequence msg) {
            messager.printMessage(Diagnostic.Kind.WARNING, msg);
        }
        public void e(CharSequence msg) {
            messager.printMessage(Diagnostic.Kind.ERROR, msg);
        }
        public void d(CharSequence msg, Element e) {
            messager.printMessage(Diagnostic.Kind.NOTE, msg, e);
        }
        public void w(CharSequence msg, Element e) {
            messager.printMessage(Diagnostic.Kind.WARNING, msg, e);
        }
        public void e(Element element, String message, Object... args) {
            if (args.length > 0) {
                message = String.format(message, args);
            }
            messager.printMessage(Diagnostic.Kind.NOTE, message, element);
        }
    }
}
