package cn.loftlab.android_test.persion.body.module;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.persionImpl.PersonArm;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/25.
 */
@Module
public class ArmModule {
    @Provides
    @Named("Arm")
    public Arm arm() {
        return new PersonArm();
    }
}
