package cn.loftlab.android_test.inject_collection2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

/**
 * Created by Administrator on 2017/9/7.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@MapKey(unwrapValue = false)
public @interface MyKey {
    String name();
    Class<?> implementingClass();
    int[] thresholds();
}
