package cn.loftlab.android_test.inject_test.limbs;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/29.
 */
@Module
public class LimbModule {
    @Provides
    @Named("leg")
    public Limb provideLeg() {
        return new Leg();
    }
    @Provides
    @Named("arm")
    public Limb provideArm() {
        return new Arm();
    }
}
