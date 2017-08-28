package cn.loftlab.android_test.inject_test;

import cn.loftlab.android_test.inject_test.mammals.MammalsModule;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/29.
 */
@Component(modules = MammalsModule.class)
public interface ActionComponent {
    void inject(Action action);
}
