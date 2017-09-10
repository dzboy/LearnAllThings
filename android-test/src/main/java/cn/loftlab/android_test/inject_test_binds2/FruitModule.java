package cn.loftlab.android_test.inject_test_binds2;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module(includes = AppleNameModule.class)
public abstract class FruitModule {
    @Binds
    public abstract Fruit bindFruit(Apple apple);
}
