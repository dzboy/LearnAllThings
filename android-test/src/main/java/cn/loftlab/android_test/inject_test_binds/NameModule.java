package cn.loftlab.android_test.inject_test_binds;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/8.
 */
@Module
public class NameModule {
    @Provides
    public String provideName() {
        return "红富士";
    }
}
