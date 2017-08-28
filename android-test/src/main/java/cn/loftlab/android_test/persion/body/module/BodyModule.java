package cn.loftlab.android_test.persion.body.module;

import javax.inject.Named;

import cn.loftlab.android_test.persion.body.ApeImpl.ApeBody;
import cn.loftlab.android_test.persion.body.Body;
import cn.loftlab.android_test.persion.body.persionImpl.PersionBody;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/8/25.
 */
@Module
public class BodyModule {
    @Provides
    @Named("person")
    Body providePersonBody (){
        return new PersionBody();
    }
    @Provides
    @Named("ape")
    Body provideApeBody() {
        return new ApeBody();
    }
}
