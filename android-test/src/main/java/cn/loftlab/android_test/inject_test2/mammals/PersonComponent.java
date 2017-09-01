package cn.loftlab.android_test.inject_test2.mammals;

import javax.inject.Named;

import cn.loftlab.android_test.inject_test2.tool.ToolsComponent;
import cn.loftlab.android_test.inject_test2.tool.ToolsModule;
import dagger.Component;

/**
 * 注解中dependencies表示：对Person的tools属性进行注入的过程中，需要依赖于ToolsComponent来提供tools对象
 * 注解中modules表示：向外提供Person对象的方法providePerson()需要依赖PersonModule类来提供Person对象
 * Created by Administrator on 2017/9/1.
 */
@Component(dependencies = ToolsComponent.class, modules = PersonModule.class)
public interface PersonComponent {
    /**
     * 此方法会把Tool对象注入到Person中，进而给tools属性赋值
     * @param person
     */
    void inject(Person person);

    /**
     * 提供Person对象，谁依赖此Component，谁从这里取对象
     * @return
     */
    Person providePerson();
}
