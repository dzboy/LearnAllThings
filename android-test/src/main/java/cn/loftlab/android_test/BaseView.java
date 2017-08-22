package cn.loftlab.android_test;

/**
 * Created by Administrator on 2017/8/22.
 */

public interface BaseView<T extends BasePresenter> {

    public void setPresenter(T presenter);

    public void initView();

    public void showLoading();

    public void hideLoading();
}
