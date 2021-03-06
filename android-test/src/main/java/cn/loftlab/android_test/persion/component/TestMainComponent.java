package cn.loftlab.android_test.persion.component;

import cn.loftlab.android_test.persion.TestMain;
import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.module.ArmModule;
import cn.loftlab.android_test.persion.body.module.BodyModule;
import cn.loftlab.android_test.persion.body.module.HeadModule;
import cn.loftlab.android_test.persion.body.module.LegModule;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/24.
 */
@Component
public interface TestMainComponent {
    void inject(TestMain testMain);
}
