package cn.loftlab.android_test.inject_test.mammals;

import cn.loftlab.android_test.inject_test.limbs.Limb;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/31.
 */

@Component
public interface MammalsComponent {
    void inject(Mammals mammals);
    Limb provideLimb();
}
