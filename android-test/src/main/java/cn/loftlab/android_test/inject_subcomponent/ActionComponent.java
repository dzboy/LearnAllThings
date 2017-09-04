package cn.loftlab.android_test.inject_subcomponent;

import cn.loftlab.android_test.inject_subcomponent.mammals.PersonComponent;
import dagger.Component;

/**
 * Action中需要的对象是来自于PersonComponent，也就是说Action依赖于PersonComponent
 * Created by Administrator on 2017/9/1.
 */
@Component(dependencies = PersonComponent.class)
public interface ActionComponent {
    /**
     * 将Action中需要用到的对象 注入到Action中
     * @param action
     */
    void inject(Action action);
}
