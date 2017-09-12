package cn.loftlab.android_test.rxtest.helloworld;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.observables.AsyncOnSubscribe;
import rx.observables.SyncOnSubscribe;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/9/12.
 */

public class SchedulerTest {
    public void test1() {
        Observable.just("a","b")
                .subscribeOn(Schedulers.immediate())
                .observeOn(Schedulers.computation())
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                        System.out.println("Subscriber subscribeOn" + Thread.currentThread().getName());
                    }
                });
    }
    public static void main(String[] args) {
        new SchedulerTest().test1();
    }
}
