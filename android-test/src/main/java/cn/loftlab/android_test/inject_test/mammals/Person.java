package cn.loftlab.android_test.inject_test.mammals;

import android.util.Log;

import javax.inject.Inject;

import cn.loftlab.android_test.inject_test.limbs.Limb;

/**
 * Created by Administrator on 2017/8/29.
 */

public class Person implements Mammals {
    @Inject
    Limb limb;
    @Override
    public void walk() {
        limb.action();
        System.out.print("walk ");

    }

    @Override
    public void run() {
        System.out.print("run ");
    }

    @Override
    public void eat() {
        System.out.print("eat ");

    }

    @Override
    public void watch() {
        System.out.print("watch ");

    }

    @Override
    public void feed() {
        System.out.print("feed ");

    }

    @Override
    public int getSex() {
        System.out.print("getSex 0 ");
        return 0;
    }
}
