package cn.loftlab.android_test.inject_test4;

import javax.inject.Inject;

import cn.loftlab.android_test.inject_test4.limbs.Limbs;

/**
 * Created by Administrator on 2017/9/5.
 */

public class Animals {
    @Inject
    Limbs limbs;

    public void action(){
        limbs.action();
        System.out.println("action");
    }
}
