package cn.loftlab.android_test.inject_test4;

import javax.inject.Inject;



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

//        AnimalsComponent animalsComponent = DaggerAnimalsComponent
//                .builder()
//                .animalsModules(new AnimalsModules())
//                .limbsComponent(DaggerLimbsComponent.create())
//                .build();
//        PersonComponent personComponent = DaggerPersonComponent.builder().animalsComponent(animalsComponent)
//                .headComponent(DaggerHeadComponent.create())
//                .personModule(new PersonModule())
//                .build();
//        DaggerTestComponent.builder().animalsComponent(animalsComponent).personComponent(personComponent).build().inject(this);
//        personComponent.inject(person);
//        person.headAction();
//        person.action();

        AnimalsComponent animalsComponent = DaggerAnimalsComponent.builder().build();
        PersonComponent personComponent = animalsComponent.personComponent().build();
        DaggerTestComponent
                .builder()
                .personComponent(personComponent)
                .animalsComponent(animalsComponent)
                .build()
                .inject(this);
        animalsComponent.inject(animals);
        personComponent.inject(person);
        person.action();
        person.headAction();
    }
    public static void main(String[] args) {
        new Test().test();
    }
}
