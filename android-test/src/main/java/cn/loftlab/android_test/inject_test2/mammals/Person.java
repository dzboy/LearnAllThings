package cn.loftlab.android_test.inject_test2.mammals;

import javax.inject.Inject;
import javax.inject.Named;

import cn.loftlab.android_test.inject_test2.tool.Tools;

/**
 * Created by Administrator on 2017/9/1.
 */

public class Person {
    @Inject
    @Named("computer")
    Tools tools;

//    public Person(Tools tools) {
//        this.tools = tools;
//    }
    public void action() {
        tools.action();
    }
}
