package cn.loftlab.android_test.persion.body.module;

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
    public Arm arm() {
        return new PersonArm();
    }
}
