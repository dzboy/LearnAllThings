package com.loftlab.lib;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 * Created by Administrator on 2017/8/16.
 * 类的工具类
 */

public class ClassValidator {
    /**
     * 是否是私有类
     * @param annotatedClass
     * @return
     */
    static boolean isPrivate(Element annotatedClass) {
        return annotatedClass.getModifiers().contains(Modifier.PRIVATE);
    }

    /**
     * 获取类名（完整路径）
     * @param type
     * @param packageName
     * @return
     */
    static String getClassName(TypeElement type, String packageName) {
        int packageLength = packageName.length() + 1;
        System.out.println("ClassValidator: qualifiedName = " + type.getQualifiedName().toString());
        System.out.println("ClassValidator: className = " + type.getQualifiedName().toString().substring(packageLength).replace(".", "$"));
        return type.getQualifiedName().toString().substring(packageLength).replace(".", "$");
    }
}
