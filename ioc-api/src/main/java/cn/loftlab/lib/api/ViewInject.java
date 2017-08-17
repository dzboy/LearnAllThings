package cn.loftlab.lib.api;

/**
 * Created by Administrator on 2017/8/16.
 */

public interface ViewInject<T> {
    void inject(T target, Object source);
}
