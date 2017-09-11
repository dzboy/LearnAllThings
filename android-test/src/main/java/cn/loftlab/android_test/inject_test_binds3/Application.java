package cn.loftlab.android_test.inject_test_binds3;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/10.
 */

public class Application implements Context{
    @Inject //TODO 模拟todoapp的方式，失败，所以暂时加上Inject，后续研究
    public Application(){}
    public void test() {
        System.out.print("test");
    }
}
