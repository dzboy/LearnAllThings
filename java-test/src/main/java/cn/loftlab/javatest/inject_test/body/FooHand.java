package cn.loftlab.javatest.inject_test.body;

import cn.loftlab.javatest.inject_test.tools.FooTools;

/**
 * Created by Administrator on 2017/8/23.
 */

public interface FooHand {
    public void take(FooTools tools);
    public void actionWithTools();
}
