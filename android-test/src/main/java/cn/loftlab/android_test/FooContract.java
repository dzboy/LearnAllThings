package cn.loftlab.android_test;

/**
 * Created by Administrator on 2017/8/22.
 */

public interface FooContract {

    interface Presenter extends BasePresenter {
        public void initData();
    }

    interface View extends BaseView<Presenter> {

    }

}
