package cn.loftlab.android_test.inject_test3;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.releasablereferences.CanReleaseReferences;

/**
 * Created by Administrator on 2017/9/5.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
@CanReleaseReferences
public @interface WeakScope {
}
