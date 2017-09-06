package cn.loftlab.android_test.inject_test4;

import cn.loftlab.android_test.inject_test4.limbs.HeadModule;
import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/9/5.
 */
//@Component(dependencies = {HeadComponent.class, AnimalsComponent.class}, modules = PersonModule.class)
@Subcomponent(modules = {PersonModule.class, HeadModule.class})
public interface PersonComponent {
    void inject(Person person);
    Person providePerson();

    /**
     * 通过subcomponent的方式 把继承自父类的属性 的 内容注入到子类中
     */
    @Subcomponent.Builder
    interface Builder{
        // PersonComponent 必须显式地声明 PersonComponent.Builder，
        // AnimalsComponent 需要用 Builder 来创建 SubComponent
        PersonComponent build();
    }
}
