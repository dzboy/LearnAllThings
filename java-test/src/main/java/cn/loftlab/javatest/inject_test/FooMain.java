package cn.loftlab.javatest.inject_test;

import cn.loftlab.javatest.inject_test.Persion.FooPerson;
import cn.loftlab.javatest.inject_test.Persion.PersonHand;
import cn.loftlab.javatest.inject_test.body.FooHand;
import cn.loftlab.javatest.inject_test.tools.FooCamer;
import cn.loftlab.javatest.inject_test.tools.FooTools;

/**
 * Created by Administrator on 2017/8/23.
 */

public class FooMain {
    public static void main(String[] args) {
//        FooHand hand = new PersonHand();
//        FooTools tools = new FooCamer();
        FooPerson person = new FooPerson();
//        person.setHand(hand);
//        person.takeTools(tools);
        person.handAction();
    }
}
