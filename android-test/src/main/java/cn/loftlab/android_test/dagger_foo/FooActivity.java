package cn.loftlab.android_test.dagger_foo;

import javax.inject.Inject;


/**
 * Created by Administrator on 2017/8/22.
 */

public class FooActivity {

    @Inject
    FooPresenter presenter;
    public void onCreate() {
//        DaggerFooComponent.create().inject(this);
//        presenter.start();
    }

    public static void main(String[] args) {
        new FooActivity().onCreate();
    }


}
