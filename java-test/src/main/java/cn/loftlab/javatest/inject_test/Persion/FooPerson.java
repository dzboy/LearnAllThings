package cn.loftlab.javatest.inject_test.Persion;

import javax.inject.Inject;

import cn.loftlab.javatest.inject_test.body.FooHand;
import cn.loftlab.javatest.inject_test.tools.FooCamer;
import cn.loftlab.javatest.inject_test.tools.FooTools;

/**
 * Created by Administrator on 2017/8/23.
 */

public class FooPerson {
    private FooHand hand;
    @Inject
    public void setHand(PersonHand hand) {
        this.hand = hand;
    }
    @Inject
    public void takeTools(FooCamer tools) {
        hand.take(tools);
    }

    public void handAction() {
        hand.actionWithTools();
    }
}
