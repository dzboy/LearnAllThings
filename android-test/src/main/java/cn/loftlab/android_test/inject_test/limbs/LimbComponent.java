package cn.loftlab.android_test.inject_test.limbs;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/1.
 */
@Component(modules = LimbModule.class)
public interface LimbComponent {
    @Limbs(Limbs.LEG)
    Limb provideLeg();
    @Limbs(Limbs.ARM)
    Limb provideArm();
}
