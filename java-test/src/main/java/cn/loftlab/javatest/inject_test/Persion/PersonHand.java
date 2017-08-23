package cn.loftlab.javatest.inject_test.Persion;

import javax.inject.Inject;

import cn.loftlab.javatest.inject_test.body.FooHand;
import cn.loftlab.javatest.inject_test.tools.FooTools;

/**
 * Created by Administrator on 2017/8/23.
 */

public class PersonHand implements FooHand {
    private FooTools tools;
    @Inject
    public PersonHand(){}
    @Override
    @Inject
    public void take(FooTools tools) {
        this.tools = tools;
    }

    @Override
    public void actionWithTools() {
        tools.action();
    }
}
