package cn.loftlab.android_test.inject_test4.limbs;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/5.
 */
@Module
public class HeadModule {
    @Provides
    public Head provideHead() {
        return new Head();
    }
}
