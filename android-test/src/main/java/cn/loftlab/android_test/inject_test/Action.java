package cn.loftlab.android_test.inject_test;

import javax.inject.Inject;
import javax.inject.Named;

import cn.loftlab.android_test.inject_test.mammals.Mammals;

/**
 * Created by Administrator on 2017/8/29.
 */

public class Action {
    @Inject
    @Named("person")
    Mammals person;

    public void action() {
        //DaggerActionComponent.create().inject(this);
//        MammalsComponent component = DaggerMammalsComponent
//                .builder()
//                .limbComponent(DaggerLimbComponent.create())
//                .mammalsModule(new MammalsModule()).build();
//        DaggerActionComponent.builder().mammalsComponent(component).build().inject(this);
        person.walk();
    }

    public static void main(String[] args) {
        new Action().action();
    }
}
