package cn.loftlab.android_test.inject_test_multibinds;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/10.
 */

public class TestMap {
    @Inject
    Map<Integer, Fruit> map;
    public void test() {
        DaggerTestComponent.builder().build().inject(this);
        System.out.print(map);
    }
    public static void main(String[] args) {
        new TestMap().test();
    }
}
