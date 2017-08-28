package cn.loftlab.android_test.persion.component;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.module.ArmModule;
import cn.loftlab.android_test.persion.body.module.BodyModule;
import cn.loftlab.android_test.persion.body.module.HeadModule;
import cn.loftlab.android_test.persion.body.module.LegModule;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/28.
 */
@Component(modules = {BodyModule.class, ArmModule.class, LegModule.class, HeadModule.class}, dependencies = LimbComponent.class)
public interface BodyComponent {
    @Named("person")
    Body getBody();
    void inject(@Named("person") Body body);
}
