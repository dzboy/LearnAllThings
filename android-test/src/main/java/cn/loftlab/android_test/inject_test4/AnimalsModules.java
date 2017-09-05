package cn.loftlab.android_test.inject_test4;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/5.
 */
@Module
public class AnimalsModules {
    @Provides
    public Animals provideAnimals() {
        return new Animals();
    }
}
