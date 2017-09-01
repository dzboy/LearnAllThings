package cn.loftlab.android_test.inject_test.limbs;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/1.
 */
@Module
public class LimbModule {
    @Provides
    @Limbs(Limbs.LEG)
    Limb provideLeg() {
        return new Leg();
    }

    @Provides
    @Limbs(Limbs.ARM)
    Limb provideArm() {
        return new Arm();
    }
}
