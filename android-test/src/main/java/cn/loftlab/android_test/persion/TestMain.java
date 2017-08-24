package cn.loftlab.android_test.persion;

import javax.inject.Inject;


/**
 * Created by Administrator on 2017/8/24.
 */

public class TestMain {
    @Inject
    Persion persion;
    public void run(){
        //DaggerPersionComponent.create().inject(this);
        //persion.action();
    }
    public static void main(String[] args) {
        //new TestMain().run();
    }
}
