package cn.loftlab.android_test.persion.body.module;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.Head;
import cn.loftlab.android_test.persion.body.persionImpl.PersionHead;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/25.
 */
@Module
public class HeadModule {
    @Provides
    @Named("head")
    public Head head() {
        return new PersionHead();
    }
}
