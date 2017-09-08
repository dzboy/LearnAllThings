package cn.loftlab.android_test.inject_test_binds;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/8.
 */
@Module
public abstract class AppleModule {
//    @Provides
//    public Fruit provideFruit(String name) {
//        return new Apple(name);
//    }
//    @Provides
//    public String provideName() {
//        return "红富士";
//    }
    @Binds
    public abstract Fruit bindFruit(Apple apple);
}
