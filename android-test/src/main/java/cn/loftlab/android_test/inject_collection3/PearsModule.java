package cn.loftlab.android_test.inject_collection3;

import java.util.Set;

import dagger.Module;
import dagger.multibindings.Multibinds;

/**
 * Created by Administrator on 2017/9/10.
 */
@Module
public abstract class PearsModule {
    @Multibinds
    abstract Set<Pear> pearSet();
}
