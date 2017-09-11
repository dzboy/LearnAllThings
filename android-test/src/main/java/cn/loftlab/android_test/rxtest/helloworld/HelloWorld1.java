package cn.loftlab.android_test.rxtest.helloworld;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.observables.SyncOnSubscribe;

/**
 * Created by Administrator on 2017/9/11.
 */

public class HelloWorld1 {
    private static final String TAG = "HelloWorld1";

    void test1() {
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(String s) {
                System.out.println("Item : " + s);
            }
        };
        Observable observable = Observable.just("hello", "hi", "haha");
        Observable observable1 = Observable.from(new String[]{"1", "2", "3"});
        observable.subscribe(observer);
        observable1.subscribe(observer);
    }

    void test2() {
        final Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(String s) {
                System.out.println("Item : " + s);
            }
        };

        Observable observable = Observable.create(new SyncOnSubscribe() {
            @Override
            protected Object generateState() {
                return null;
            }

            @Override
            protected Object next(Object state, Observer observer) {
                return null;
            }

            @Override
            public void call(Object o) {
                subscriber.onNext("Hello");
                subscriber.onNext("Hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        });
        observable.subscribe(subscriber);
    }

    void test3() {
        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };
        Action1<Throwable> onErrorAction = new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                throwable.printStackTrace();
            }
        };

        Action0 onCompleteAction = new Action0() {
            @Override
            public void call() {
                System.out.println("complete");
            }
        };

        Observable observable = Observable.from(new String[]{"00","11"});
        observable.subscribe(onNextAction, onErrorAction, onCompleteAction);
    }
    public static void main(String[] args) {
//        new HelloWorld1().test1();
//        new HelloWorld1().test2();
        new HelloWorld1().test3();
    }
}
