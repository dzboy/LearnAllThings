package cn.loftlab.android_test.inject_test_multibinds;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntKey;
import dagger.multibindings.IntoMap;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module
public abstract class FruitModule {
    @IntKey(1)
    @IntoMap
    @Binds
    public abstract Fruit provideMap(Apple apple);
}
