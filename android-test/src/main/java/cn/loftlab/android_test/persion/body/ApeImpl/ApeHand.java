package cn.loftlab.android_test.persion.body.ApeImpl;

import cn.loftlab.android_test.persion.body.Hand;
import cn.loftlab.android_test.persion.tools.Tools;

/**
 * Created by Administrator on 2017/8/24.
 */

public class ApeHand implements Hand {
    @Override
    public void action() {
        System.out.print("摆手");
    }

    @Override
    public void actionWith(Tools tools) {
        tools.useage();
        tools.use();
    }
}
