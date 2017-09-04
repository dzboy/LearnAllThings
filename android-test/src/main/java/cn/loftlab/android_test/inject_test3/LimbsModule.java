package cn.loftlab.android_test.inject_test3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/4.
 */
@Module
public class LimbsModule {
    @Provides
//    @Singleton
    public Limbs provideLimbs(){
        return new Limbs();
    }
}
