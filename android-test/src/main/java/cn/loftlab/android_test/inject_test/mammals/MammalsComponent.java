package cn.loftlab.android_test.inject_test.mammals;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by Administrator on 2017/8/29.
 */
//@Component(modules = MammalsModule.class)
public interface MammalsComponent {
  //  @Named("person")
    Mammals getPerson();

    //@Named("ape")
    Mammals getApe();
}
