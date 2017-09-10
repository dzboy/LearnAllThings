package cn.loftlab.android_test.inject_test_multibinds;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module
public class AppleNameModule {
    @Provides
    public String provideAppleName() {
        return "hongfushi";
    }
}
