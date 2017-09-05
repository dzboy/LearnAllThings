package cn.loftlab.android_test.inject_test4;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/5.
 */
@Component(dependencies = {AnimalsComponent.class, PersonComponent.class})
public interface TestComponent {
    void inject(Test test);
}
