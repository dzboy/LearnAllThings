package cn.loftlab.android_test.persion.body.persionImpl;

import cn.loftlab.android_test.persion.body.Arm;
import cn.loftlab.android_test.persion.body.Hand;

/**
 * Created by Administrator on 2017/8/24.
 */

public class PersonArm implements Arm {
    Hand hand;
    @Override
    public void action() {
        System.out.print("甩胳膊");
        hand.action();
    }

    @Override
    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
