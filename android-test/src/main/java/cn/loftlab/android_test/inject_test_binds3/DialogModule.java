package cn.loftlab.android_test.inject_test_binds3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/11.
 */
@Module
public class DialogModule {
    @Provides
    public Dialog provideDialog() {
        return new Dialog();
    }
}
