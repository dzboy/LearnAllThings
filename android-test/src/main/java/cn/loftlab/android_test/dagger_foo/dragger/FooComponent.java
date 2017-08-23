package cn.loftlab.android_test.dagger_foo.dragger;

import cn.loftlab.android_test.dagger_foo.FooActivity;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/23.
 */
@Component(modules = FooModule.class)
public interface FooComponent {
    void inject(FooActivity activity);
}
