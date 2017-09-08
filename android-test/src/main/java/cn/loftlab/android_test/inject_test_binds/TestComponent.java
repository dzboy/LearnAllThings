package cn.loftlab.android_test.inject_test_binds;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/8.
 */
@Component(modules = {AppleModule.class,NameModule.class})
public interface TestComponent {
    void inject(Test test);
}
