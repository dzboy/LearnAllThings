package cn.loftlab.android_test.inject_test3;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.releasablereferences.ForReleasableReferences;
import dagger.releasablereferences.ReleasableReferenceManager;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Main {
    @Inject
    @ForReleasableReferences(WeakScope.class)
    ReleasableReferenceManager manager;
//    @Singleton
//    @MyScope
    @Component(modules = {LimbsModule.class, PersonModule.class})
    interface PersonComponent {
        Person getPerson();
        void inject(Person person);
    }
    @Component
    @WeakScope
    interface MainComponent{
        void inject(Main main);
    }
    public static void main(String[] args) {
//        final Main main = new Main();
//        DaggerMain_MainComponent.create().inject(main);
//        final PersonComponent pc = DaggerMain_PersonComponent.builder().build();
////        Person person1 = pc.getPerson();
////        Person person2 = pc.getPerson();
////        pc.inject(person1);
////        pc.inject(person2);
////        person1.move();
////        person2.move();
////        System.out.println(person1 + "  " + person2 + "  " + (person1 == person2));
//        for (int i = 0; i < 50; i++) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            new Thread() {
//                @Override
//                public void run() {
//                    super.run();
//                    for (int i = 0; i < 100; i++) {
//                        if (i % 10 == 0) {
//                            System.gc();
//                            System.err.println("==============GC Called===============");
//                        }
//                        Person personTest = pc.getPerson();
//                        pc.inject(personTest);
//                        personTest.move();
//                    }
//                }
//            }.start();
//        }
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                main.manager.releaseStrongReferences();
//            }
//        }.start();
    }
}
