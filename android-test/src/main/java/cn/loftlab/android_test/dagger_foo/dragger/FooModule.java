package cn.loftlab.android_test.dagger_foo.dragger;

import cn.loftlab.android_test.FooContract;
import cn.loftlab.android_test.dagger_foo.FooView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/23.
 */
@Module
public class FooModule {
    private final FooContract.View view;
    public FooModule(FooContract.View view) {
        this.view = view;
    }

    @Provides
    FooContract.View provideView() {
        return view;
    }
}
