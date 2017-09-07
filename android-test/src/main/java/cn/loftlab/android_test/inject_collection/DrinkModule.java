package cn.loftlab.android_test.inject_collection;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

/**
 * Created by Administrator on 2017/9/7.
 */
@Module
public class DrinkModule {
    @Provides
    @IntoSet
    public BananaBean providerBanana() {
        return new BananaBean("巴拿马香蕉");
    }
}
