package cn.loftlab.android_test.persion.body.persionImpl;

import javax.inject.Inject;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.Foot;
import cn.loftlab.android_test.persion.body.Hand;
import cn.loftlab.android_test.persion.body.Head;
import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.Limb;

/**
 * Created by Administrator on 2017/8/24.
 */

public class PersionBody implements Body {
    Arm arm;
    Head head;
    Leg leg;
    @Inject
    public PersionBody(){}

    @Override
    public void actionWith(Limb limb) {
        limb.action();
    }
}
