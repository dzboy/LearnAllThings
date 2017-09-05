package cn.loftlab.android_test.inject_test4;

import cn.loftlab.android_test.inject_test4.limbs.HeadComponent;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/9/5.
 */
@Component(dependencies = {HeadComponent.class, AnimalsComponent.class}, modules = PersonModule.class)
public interface PersonComponent {
    void inject(Person person);
    Person providePerson();
}
