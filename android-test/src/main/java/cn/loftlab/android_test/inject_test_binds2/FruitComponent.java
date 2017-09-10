package cn.loftlab.android_test.inject_test_binds2;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/10.
 */
@Component(modules = FruitModule.class)
public interface FruitComponent {
    void inject(FruitTest test);
}
