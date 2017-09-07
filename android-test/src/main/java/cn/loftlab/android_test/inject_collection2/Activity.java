package cn.loftlab.android_test.inject_collection2;

import java.util.Map;

import javax.inject.Inject;


/**
 * Created by Administrator on 2017/9/7.
 */

public class Activity {
    @Inject
    Map<Class<Apple>, String> appmap;
    @Inject
    Map<Integer, Apple> map;

    public void onCreate() {
        DaggerActivityComponent.create().inject(this);
        System.out.println(map);
        System.out.println(appmap);
    }
    public static void main(String[] args) {
        new Activity().onCreate();
    }
}
