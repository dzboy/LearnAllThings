package cn.loftlab.android_test.inject_test4.limbs;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/5.
 */
@Component(modules = LimbsModule.class)
public interface LimbsComponent {
    Limbs provideLimbs();
}
