package cn.loftlab.android_test.persion;

import javax.inject.Inject;
import javax.inject.Named;

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
public class Mammals {
    @Inject
    @Named("person")
    Body body;

    @Inject
    public Mammals() {
        System.out.print("哺乳动物");
    }

//    @Inject
//    public void setBody(Body body) {
//        this.body = body;
//    }

    public void action() {
        body.action();
        System.out.print("action");
    }


}
