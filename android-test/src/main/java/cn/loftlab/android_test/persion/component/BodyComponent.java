package cn.loftlab.android_test.persion.component;

import cn.loftlab.android_test.persion.Persion;
import dagger.Component;

/**
 * Created by Administrator on 2017/8/24.
 */
@Component
public interface BodyComponent {
    void inject(Persion persion);
}
