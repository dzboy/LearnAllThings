package cn.loftlab.android_test.inject_test_multibinds;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/10.
 */
@Component(modules = {FruitModule.class, AppleNameModule.class})
public interface TestComponent {
    void inject(TestMap testMap);
}
