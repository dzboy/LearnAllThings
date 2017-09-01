package cn.loftlab.android_test.inject_test2.tool;

import javax.inject.Named;

import dagger.Component;
import dagger.Provides;

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
