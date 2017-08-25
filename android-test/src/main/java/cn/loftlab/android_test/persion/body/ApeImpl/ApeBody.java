package cn.loftlab.android_test.persion.body.ApeImpl;

import javax.inject.Inject;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.Head;
import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.Limb;

/**
 * Created by Administrator on 2017/8/25.
 */

public class ApeBody implements Body {
    @Inject
    Arm arm;
    @Inject
    Head head;
    @Inject
    Leg leg;

    public ApeBody() {
        System.out.print("ape");
    }
    @Override
    public void actionWith(Limb limb) {
        limb.action();
    }

    @Override
    public void action() {
        head.action();
    }
}
