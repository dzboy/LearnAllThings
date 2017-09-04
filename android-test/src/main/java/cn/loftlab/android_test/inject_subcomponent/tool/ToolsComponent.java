package cn.loftlab.android_test.inject_subcomponent.tool;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/1.
 */
@Component(modules = ToolsModule.class)
public interface ToolsComponent {
    @Named("computer")
    Tools provideComputer();

    @Named("notepad")
    Tools provideNotePad();
}
