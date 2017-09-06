package cn.loftlab.android_test.inject_test4;

import cn.loftlab.android_test.inject_test4.limbs.LimbsModule;
import dagger.Component;

/**
 * Created by Administrator on 2017/9/5.
 */
@Component(modules = {AnimalsModules.class, LimbsModule.class})
public interface AnimalsComponent {
    void inject(Animals animals);
    Animals provideAnimals();
    // Limbs provideLimbs(); // subcomponent的方式不用暴露 提供Limbs的接口

    PersonComponent.Builder personComponent();
}
