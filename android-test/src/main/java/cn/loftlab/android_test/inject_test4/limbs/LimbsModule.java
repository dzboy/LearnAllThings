package cn.loftlab.android_test.inject_test4.limbs;

import cn.loftlab.android_test.inject_test4.PersonComponent;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/5.
 */
@Module(subcomponents = PersonComponent.class)
public class LimbsModule {
    @Provides
    public Limbs provideLimbs() {
        return new Limbs();
    }
}
