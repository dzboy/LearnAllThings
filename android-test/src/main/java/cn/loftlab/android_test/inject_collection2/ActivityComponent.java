package cn.loftlab.android_test.inject_collection2;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/7.
 */
@Component(modules = {AppleModule.class, NameModule.class})
public interface ActivityComponent {
    void inject(Activity activity);
}
