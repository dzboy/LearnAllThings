package cn.loftlab.android_test.inject_test2;

import javax.inject.Inject;

import cn.loftlab.android_test.inject_test2.mammals.Person;

/**
 * Created by Administrator on 2017/9/1.
 */

public class Action {
    @Inject
    public Person person;
    public void run() {
//        PersonComponent component = DaggerPersonComponent.builder()
//                .personModule(new PersonModule())
//                .toolsComponent(DaggerToolsComponent.create()).build();
//        DaggerActionComponent
//                .builder()
//                .personComponent(component)
//                .build()
//                .inject(this);
//        component.inject(person);
        person.action();
    }
    public static void main(String[] args) {
        new Action().run();
    }
}
