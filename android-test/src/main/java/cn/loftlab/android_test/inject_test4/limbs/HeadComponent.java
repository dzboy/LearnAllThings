package cn.loftlab.android_test.inject_test4.limbs;

import dagger.Component;
import dagger.Module;

/**
 * Created by Administrator on 2017/9/5.
 */
@Component(modules = HeadModule.class)
public interface HeadComponent {
    Head provideHead();
}
