package cn.loftlab.android_test.inject_collection;

import java.util.Set;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Administrator on 2017/9/7.
 */

@Component(modules = {FruitModule.class, DrinkModule.class})
public interface FruitActivityComponent {

    void inject(FruitActivity activity);

    Set<BananaBean> setBanana();

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder activity(FruitActivity activity);
        FruitActivityComponent build();
    }
}
