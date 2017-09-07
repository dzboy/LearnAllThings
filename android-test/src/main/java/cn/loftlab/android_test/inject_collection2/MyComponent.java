package cn.loftlab.android_test.inject_collection2;

import java.util.Map;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/7.
 */

@Component(modules = MyModule.class)
public interface MyComponent {
    Map<MyKey, String> myKeyStringMap();
}