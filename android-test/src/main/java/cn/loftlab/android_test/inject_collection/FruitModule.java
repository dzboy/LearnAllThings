package cn.loftlab.android_test.inject_collection;

import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

/**
 * Created by Administrator on 2017/9/7.
 */

@Module
public class FruitModule {

    @Provides
    @IntoSet
    public BananaBean providerBanana() {
        return new BananaBean("特朗普香蕉");
    }

    @Provides
    @ElementsIntoSet
    public Set<BananaBean> providerBananaSet() {
        Set<BananaBean> set = new HashSet<>();
        set.add(new BananaBean("布什香蕉"));
        set.add(new BananaBean("约翰逊香蕉"));
        return set;
    }
}
