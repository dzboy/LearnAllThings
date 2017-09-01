package cn.loftlab.android_test.inject_test2.mammals;

import javax.inject.Named;

import cn.loftlab.android_test.inject_test2.tool.Tools;
import dagger.Module;
import dagger.Provides;

/**
 * 此类实例化对象，向外提供Person对象，用于提供给Injector进行对象注入（通过Component完成此操作）
 * Created by Administrator on 2017/9/1.
 */
@Module
public class PersonModule {
    @Provides
    Person providePerson() {
//        return new Person(tools);
        return new Person();
    }
}
