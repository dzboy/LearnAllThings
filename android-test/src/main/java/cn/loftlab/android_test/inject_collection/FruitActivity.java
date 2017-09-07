package cn.loftlab.android_test.inject_collection;

import java.util.Set;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/7.
 */

class FruitActivity {
    @Inject
    Set<BananaBean> mSetBanana;

    @Inject
    BananaBeanSet mSetBananaBean;

    protected void onCreate() {
        FruitActivityComponent component = DaggerFruitActivityComponent.builder().activity(this).build();
        component.inject(this);

        Set<BananaBean> setBanana = component.setBanana();
        //  [BananaBean{name='布什香蕉'}, BananaBean{name='约翰逊香蕉'}, BananaBean{name='特朗普香蕉'}, BananaBean{name='巴拿马香蕉'}]
        System.out.println("setBanana: " + setBanana.toString());
        // [BananaBean{name='巴拿马香蕉'}, BananaBean{name='布什香蕉'}, BananaBean{name='约翰逊香蕉'}, BananaBean{name='特朗普香蕉'}]
        System.out.println("mSetBanana: " + mSetBanana.toString());
        // [BananaBean{name='巴拿马香蕉'}, BananaBean{name='布什香蕉'}, BananaBean{name='约翰逊香蕉'}, BananaBean{name='特朗普香蕉'}]
        System.out.println("mSetBananaBean: " + mSetBananaBean.toString());

    }

    public static void main(String[] args) {
        new FruitActivity().onCreate();
    }
}
