package cn.loftlab.android_test.inject_test_binds3;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Administrator on 2017/9/10.
 */
@Component(dependencies = DialogComponent.class)
public interface TestBindComponent {
    void inject(TestBind testBind);

//    @Component.Builder
//    interface Builder{
//        @BindsInstance
//        Builder application(Application app);
//        TestBindComponent build();
//    }
}
