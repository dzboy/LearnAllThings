package cn.loftlab.android_test.persion.body.module;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.persionImpl.PersionLeg;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/25.
 */
@Module
public class LegModule {
    @Provides
    @Named("leg")
    public Leg leg() {
        return new PersionLeg();
    }
}
