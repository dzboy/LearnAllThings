package cn.loftlab.android_test.dagger_foo;

import javax.inject.Inject;

import cn.loftlab.android_test.dagger_foo.dragger.DaggerFooComponent;
import cn.loftlab.android_test.dagger_foo.dragger.FooModule;


/**
 * Created by Administrator on 2017/8/22.
 */

public class FooActivity {

    @Inject
    FooPresenter presenter;
    public void onCreate() {
        DaggerFooComponent.builder().fooModule(new FooModule(new FooView())).build().inject(this);
        presenter.start();
        //http://blog.csdn.net/io_field/article/details/70947365
    }

    public static void main(String[] args) {
        new FooActivity().onCreate();
    }


}
