package cn.loftlab.android_test.persion;

import javax.inject.Inject;

import cn.loftlab.android_test.persion.component.DaggerTestMainComponent;


/**
 * Created by Administrator on 2017/8/24.
 */

public class TestMain {
    @Inject
    Mammals mammals;
    public void run(){
        //DaggerPersionComponent.create().inject(this);
        //persion.action();
        DaggerTestMainComponent.create().inject(this);
        mammals.action();
    }
    public static void main(String[] args) {
        new TestMain().run();
    }
}
