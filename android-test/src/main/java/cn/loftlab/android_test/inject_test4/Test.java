package cn.loftlab.android_test.inject_test4;

import javax.inject.Inject;

import cn.loftlab.android_test.inject_test4.limbs.DaggerHeadComponent;
import cn.loftlab.android_test.inject_test4.limbs.DaggerLimbsComponent;


/**
 * Created by Administrator on 2017/9/5.
 */

public class Test {
    @Inject
    Animals animals;
    @Inject
    Person person;
    public void test() {
//        AnimalsComponent component = DaggerAnimalsComponent.builder()
//                .limbsComponent(DaggerLimbsComponent.create())
//                .animalsModules(new AnimalsModules())
//                .build();
//        DaggerTestComponent.builder()
//                .animalsComponent(component)
//                .build()
//                .inject(this);
//        component.inject(animals);
//        DaggerTestComponent.builder().animalsComponent(DaggerAnimalsComponent.create()).build().inject(this);
//        DaggerTestComponent.create().inject(this);
//        DaggerAnimalsComponent.create().inject(animals);
        //animals.action();
        AnimalsComponent animalsComponent = DaggerAnimalsComponent
                .builder()
                .animalsModules(new AnimalsModules())
                .limbsComponent(DaggerLimbsComponent.create())
                .build();
        PersonComponent personComponent = DaggerPersonComponent.builder().animalsComponent(animalsComponent)
                .headComponent(DaggerHeadComponent.create())
                .personModule(new PersonModule())
                .build();
        DaggerTestComponent.builder().animalsComponent(animalsComponent).personComponent(personComponent).build().inject(this);
        personComponent.inject(person);
        person.headAction();
        person.action();
    }
    public static void main(String[] args) {
        new Test().test();
    }
}
