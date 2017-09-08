package cn.loftlab.android_test.inject_test_binds;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/8.
 */

public class Apple implements Fruit {
    private String name;
    @Inject
    public Apple(String name) {
        this.name = name;
    }

    @Override
    public void name() {
        System.out.print(name);
    }
}
