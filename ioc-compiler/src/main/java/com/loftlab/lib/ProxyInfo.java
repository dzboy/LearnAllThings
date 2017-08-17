package com.loftlab.lib;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;

/**
 * Created by Administrator on 2017/8/16.
 */

public class ProxyInfo {
    /**
     * 包名
     */
    private String packageName;
    /**
     * 编译生成的包名
     */
    private String proxyClassName;
    /**
     * 注解修饰的类或接口
     */
    private TypeElement typeElement;
    /**
     * 保存了所有BindView 注解的信息
     */
    public Map<Integer, VariableElement> injectVariables = new HashMap<>();

    public int contentViewid;
    public static final String PROXY = "ViewInject";

    public ProxyInfo(Elements elements, TypeElement typeElement) {
        this.typeElement = typeElement;
        PackageElement pe = elements.getPackageOf(typeElement);
        String packageName = pe.getQualifiedName().toString();
        String className = ClassValidator.getClassName(typeElement, packageName);
        System.out.println("ProxyInfo : className = " + className);
        this.packageName = packageName;
        System.out.println("ProxyInfo : packageName = " + packageName);
        this.proxyClassName = className + "$$" + PROXY;
        System.out.println("ProxyInfo : proxyClassName = " + proxyClassName);
    }

    public String generateJavaCode() {
        StringBuilderProxy b = new StringBuilderProxy();
        b.setBuilder(new StringBuilder());
        b.a("// Generated code. Do not modify!\n");
        b.a("package ", packageName, ";\n\n");
        b.a("import cn.loftlab.lib.api.*;\n");
        b.a("\n");
        b.a("public class ", proxyClassName, " implements ", ProxyInfo.PROXY, "<", typeElement.getQualifiedName(), ">", "{\n");

        generateMethods(b);

        b.a("}\n");
        return b.toString();
    }

    private void generateMethods(StringBuilderProxy b) {
        StringBuilderProxy ifStr = new StringBuilderProxy();
        StringBuilderProxy elseStr = new StringBuilderProxy();
        ifStr.setBuilder(new StringBuilder());
        elseStr.setBuilder(new StringBuilder());

        b.a("\t@Override\n");
        b.a("\tpublic void inject(", typeElement.getQualifiedName(), " host, Object source) {\n");

        for (int id : injectVariables.keySet()) {
            VariableElement variableElement = injectVariables.get(id);
            String name = variableElement.getSimpleName().toString();
            String type = variableElement.asType().toString();

            ifStr.a("\t\t\thost.", name, " = ", "(", type, ")(((android.app.Activity)source).findViewById(", id, "));\n");
            elseStr.a("\t\t\thost.", name, "=", "(", type, ")(((android.view.View)source).findViewById(", id, "));\n");
        }

        b.a("\t\tif (source instanceof android.app.Activity) {\n");
        if (contentViewid != 0) {
            b.a("\t\t\thost.setContentView(", contentViewid, ");\n");
        }
        b.a(ifStr);
        b.a("\t\t} else {\n");
        b.a(elseStr);
        b.a("\t\t}\n");
        b.a("\t}\n");
    }

    public String getProxyClassFullName() {
        return packageName + "." + proxyClassName;
    }

    public TypeElement getTypeElement() {
        return typeElement;
    }


    static class StringBuilderProxy {
        StringBuilder builder;
        public void setBuilder(StringBuilder builder) {
            this.builder = builder;
        }
        public StringBuilderProxy a(CharSequence str) {
            builder.append(str);
            return this;
        }
        public StringBuilderProxy a(Object...objs) {
            for (Object obj : objs) {
                builder.append(obj);
            }
            return this;
        }

        @Override
        public String toString() {
            return builder.toString();
        }
    }
}
