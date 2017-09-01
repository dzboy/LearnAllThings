package cn.loftlab.android_test.inject_test.mammals;

import javax.inject.Named;

import cn.loftlab.android_test.inject_test.limbs.Limb;
import cn.loftlab.android_test.inject_test.limbs.Limbs;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/29.
 */
@Module
public class MammalsModule {
    @Provides
    @Named("person")
    public Mammals providePerson() {
        return new Person();
    }
    @Provides
    @Named("ape")
    public Mammals provideApe() {
        return new Ape();
    }
}
