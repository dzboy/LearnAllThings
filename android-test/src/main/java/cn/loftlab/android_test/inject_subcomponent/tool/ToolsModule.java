package cn.loftlab.android_test.inject_subcomponent.tool;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/1.
 */
@Module
public class ToolsModule {
    @Named("computer")
    @Provides
    public Tools provideComputer() {
        return new Computer();
    }

    @Named("notepad")
    @Provides
    public Tools provideNotePad() {
        return new NotePad();
    }
}
