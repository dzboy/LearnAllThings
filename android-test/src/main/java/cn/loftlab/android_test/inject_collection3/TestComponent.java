package cn.loftlab.android_test.inject_collection3;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/10.
 */
@Component(modules = PearsModule.class)
public interface TestComponent {
    void inject(Test test);
}
