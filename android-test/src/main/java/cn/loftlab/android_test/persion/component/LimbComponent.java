package cn.loftlab.android_test.persion.component;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.Head;
import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.module.ArmModule;
import cn.loftlab.android_test.persion.body.module.HeadModule;
import cn.loftlab.android_test.persion.body.module.LegModule;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/28.
 */
@Component(modules = {ArmModule.class, LegModule.class, HeadModule.class})
public interface LimbComponent {
    @Named("arm")
    Arm getArm();
    @Named("leg")
    Leg getLeg();
    @Named("head")
    Head getHead();

}
