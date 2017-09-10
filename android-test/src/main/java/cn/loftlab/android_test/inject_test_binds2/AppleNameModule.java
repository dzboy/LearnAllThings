package cn.loftlab.android_test.inject_test_binds2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module
public class AppleNameModule {
    @Provides
    public String provideName() {
        return "苹果";
    }
}
