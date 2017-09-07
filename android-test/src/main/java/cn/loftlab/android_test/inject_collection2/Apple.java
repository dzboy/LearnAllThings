package cn.loftlab.android_test.inject_collection2;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/7.
 */

public class Apple {
    String name;
    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
