package cn.loftlab.lib.api;

import android.app.Activity;
import android.view.View;

/**
 * Created by Administrator on 2017/8/16.
 */

public class ViewInjector {
    private static final String SUFFIX = "$$ViewInject";
    public static void injectView(Activity activity) {
        ViewInject proxyActivity = findProxyActivity(activity);
        proxyActivity.inject(activity, activity);
    }
    public static void injectView(Object object, View view) {
        ViewInject proxyActivity = findProxyActivity(object);
        proxyActivity.inject(object, view);
    }

    public static ViewInject findProxyActivity(Object activity) {
        try {
            Class<?> clazz = activity.getClass();
            Class<?> injectorClazz = Class.forName(clazz.getName() + SUFFIX);
            return (ViewInject) injectorClazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException(String.format("can not find %s , something when compiler.", activity.getClass().getSimpleName() + SUFFIX));

    }
}
