package cn.loftlab.android_test.inject_test.limbs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2017/9/1.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Limbs {
    String LEG = "leg";
    String ARM = "arm";
    String value() default "";
}
