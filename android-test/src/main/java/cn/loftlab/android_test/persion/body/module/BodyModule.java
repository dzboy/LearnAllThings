package cn.loftlab.android_test.persion.body.module;

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
    Body createPersionBody (){
        return new PersionBody();
    }
}
