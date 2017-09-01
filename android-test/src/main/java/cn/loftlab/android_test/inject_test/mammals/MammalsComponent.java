package cn.loftlab.android_test.inject_test.mammals;

import javax.inject.Named;

import cn.loftlab.android_test.inject_test.limbs.LimbComponent;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/31.
 */

@Component(modules = MammalsModule.class, dependencies = LimbComponent.class)
public interface MammalsComponent {
    void inject(@Named("person") Mammals mammals); // FIXME 暂时无解，就算加了限定符，也不能直接对接口类型的对象进行注入
    @Named("person")
    Mammals provideMammals();
}
