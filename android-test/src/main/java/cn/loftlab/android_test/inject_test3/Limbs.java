package cn.loftlab.android_test.inject_test3;

import javax.inject.Inject;

import cn.loftlab.android_test.persion.body.Limb;
import dagger.Reusable;

/**
 * Created by Administrator on 2017/9/4.
 */
public class Limbs {
    public static int COUNT = 0;
    public void action() {
        System.err.println("------" + "thread : " + Thread.currentThread().getName() + "  =========  " + this);
        System.out.println("limbs action");
    }

    public Limbs() {
        System.err.println("construct : " + COUNT);
        COUNT++;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.err.println("finalize : " + COUNT);
        COUNT--;
    }
}
