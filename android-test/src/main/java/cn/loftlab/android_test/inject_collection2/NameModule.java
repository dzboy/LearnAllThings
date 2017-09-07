package cn.loftlab.android_test.inject_collection2;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * Created by Administrator on 2017/9/7.
 */
@Module
public class NameModule {
    @Provides
    @IntKey(1)
    @IntoMap
    public Apple provideName() {
        return new Apple("黄香蕉");
    }
}
