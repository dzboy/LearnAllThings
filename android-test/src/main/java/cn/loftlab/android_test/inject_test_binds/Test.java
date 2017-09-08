package cn.loftlab.android_test.inject_test_binds;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/8.
 */

public class Test {
    @Inject
    Fruit apple;
    public static void main(String[] args) {
        Test test = new Test();
        DaggerTestComponent.create().inject(test);
        test.apple.name();
    }
}
