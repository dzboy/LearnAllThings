package cn.loftlab.android_test.inject_collection2;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * Created by Administrator on 2017/9/7.
 */
@Module
public class AppleModule {
    @Provides
    @AppleKey(Apple.class)
    @IntoMap
    public String provideApple() {
        return "红富士";
    }

}
