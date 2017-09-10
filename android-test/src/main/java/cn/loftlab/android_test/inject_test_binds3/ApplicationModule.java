package cn.loftlab.android_test.inject_test_binds3;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module
public abstract class ApplicationModule {
    @Binds
    public abstract Context bindContext(Application app);
}
