package cn.loftlab.android_test.inject_collection2;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * Created by Administrator on 2017/9/7.
 */

@Module
public class MyModule {
    @Provides
    @IntoMap
    @MyKey(name = "abc", implementingClass = Abc.class, thresholds = {1, 5, 10})
    String provideAbc1510Value() {
        return "foo";
    }

}
