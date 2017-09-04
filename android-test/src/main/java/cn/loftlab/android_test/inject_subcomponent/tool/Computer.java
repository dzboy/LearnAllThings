package cn.loftlab.android_test.inject_subcomponent.tool;

/**
 * Created by Administrator on 2017/9/1.
 */

public class Computer implements Tools {
    @Override
    public void action() {
        System.out.println("compute");
    }
}
