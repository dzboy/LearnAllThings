package cn.loftlab.android_test.persion.body.ApeImpl;

import cn.loftlab.android_test.persion.body.Foot;
import cn.loftlab.android_test.persion.body.Leg;

/**
 * Created by Administrator on 2017/8/24.
 */

public class ApeLeg implements Leg {
    Foot foot;
    @Override
    public void action() {
        System.out.print("抬腿");
        foot.action();
    }

    @Override
    public void setFoot(Foot foot) {
        this.foot = foot;
    }
}
