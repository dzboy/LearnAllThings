package cn.loftlab.android_test.inject_test3;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;
import dagger.Reusable;

/**
 * Created by Administrator on 2017/9/4.
 */
@Singleton
@Reusable
public class Person {
    @Inject
    Lazy<Limbs> limbs;
    @Inject
    Limbs limbs2;
//    @Inject
//    public Person(Limbs limbs) {
//        this.limbs = limbs;
//    }
    public void move() {
        System.out.println(limbs + "  " + limbs2);
        limbs.get().action();
    }
}
