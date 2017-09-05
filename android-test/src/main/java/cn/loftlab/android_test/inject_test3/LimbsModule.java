package cn.loftlab.android_test.inject_test3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * Created by Administrator on 2017/9/4.
 */
@Module
public class LimbsModule {
//    @Singleton
//    @Reusable
    @Provides
//    @MyScope
    public Limbs provideLimbs(){
        return new Limbs();
    }
}
