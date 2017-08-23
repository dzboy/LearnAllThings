package cn.loftlab.javatest.inject_test.tools;

import javax.inject.Inject;

import cn.loftlab.javatest.inject_test.tools.FooTools;

/**
 * Created by Administrator on 2017/8/23.
 */

public class FooCamer implements FooTools {
    @Inject
    public FooCamer(){}
    @Override
    public void useage() {
        System.out.println("take photos");
    }

    @Override
    public void action() {
        System.out.println("take a photo");
    }
}
