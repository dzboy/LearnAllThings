package cn.loftlab.android_test.dagger_foo;

import javax.inject.Inject;

import cn.loftlab.android_test.FooContract;

/**
 * Created by Administrator on 2017/8/22.
 */

public class FooPresenter implements FooContract.Presenter {

    FooContract.View view;
    @Inject
    public FooPresenter(FooContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {
        System.out.println("start");
        initData();
    }

    @Override
    public void initData() {
        System.out.println("initData");
    }
}
