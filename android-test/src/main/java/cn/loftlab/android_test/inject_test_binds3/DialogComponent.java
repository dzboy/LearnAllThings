package cn.loftlab.android_test.inject_test_binds3;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/11.
 */
@Component(modules = {ApplicationModule.class, DialogModule.class})
public interface DialogComponent {
    void inject(Dialog dialog);
    Dialog provideDialog();
}
