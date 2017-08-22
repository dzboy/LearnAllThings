package cn.loftlab.android_test.dagger_foo;

import cn.loftlab.android_test.FooContract;

/**
 * Created by Administrator on 2017/8/22.
 */

public class FooView implements FooContract.View {
    FooContract.Presenter presenter;
    @Override
    public void setPresenter(FooContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void initView() {
        System.out.println("initView");
    }

    @Override
    public void showLoading() {

        System.out.println("showLoading");
    }

    @Override
    public void hideLoading() {

        System.out.println("hideLoading");
    }
}
