package cn.loftlab.android_test.inject_test4;

import javax.inject.Inject;

import cn.loftlab.android_test.inject_test4.limbs.Head;

/**
 * Created by Administrator on 2017/9/5.
 */

public class Person extends Animals {
    @Inject
    Head head;
    public void headAction() {
        head.action();
    }
}
