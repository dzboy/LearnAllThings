package cn.loftlab.android_test.inject_test_binds3;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/10.
 */

public class Dialog {
    @Inject
    Context context;
    public void show() {
        System.out.print("context == null : " + (context == null));
    }
}
