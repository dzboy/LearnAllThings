package cn.loftlab.android_test.inject_test3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Main {
    @Singleton
    @Component(modules = {LimbsModule.class, PersonModule.class})
    interface PersonComponent {
        Person getPerson();
        void inject(Person person);
    }
    public static void main(String[] args) {
        PersonComponent pc = DaggerMain_PersonComponent.builder().build();
        Person person1 = pc.getPerson();
        Person person2 = pc.getPerson();
        pc.inject(person1);
        pc.inject(person2);
        person1.move();
        person2.move();
        System.out.println(person1 + "  " + person2 + "  " + (person1 == person2));
    }
}
