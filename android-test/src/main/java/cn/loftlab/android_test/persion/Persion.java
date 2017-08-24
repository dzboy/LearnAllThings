package cn.loftlab.android_test.persion;

import javax.inject.Inject;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.Foot;
import cn.loftlab.android_test.persion.body.Hand;
import cn.loftlab.android_test.persion.body.Head;
import cn.loftlab.android_test.persion.body.Leg;
import cn.loftlab.android_test.persion.body.Limb;
import cn.loftlab.android_test.persion.body.persionImpl.PersionBody;

/**
 * Created by Administrator on 2017/8/24.
 */
public class Persion {
    //@Inject
    PersionBody body;

    @Inject
    public Persion() {

    }

    @Inject
    public void setBody(PersionBody body) {
        this.body = body;
    }

    public void action() {
        System.out.print("action");
    }


}
