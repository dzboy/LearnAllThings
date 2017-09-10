package cn.loftlab.android_test.inject_test_binds2;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/10.
 */

public class Apple implements Fruit {
    String name;
    @Inject
    public Apple(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.print(name);
    }
}
