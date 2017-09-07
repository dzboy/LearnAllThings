package cn.loftlab.android_test.inject_collection;

import java.util.Set;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/7.
 */

public class BananaBeanSet {
    Set<BananaBean> set;

    @Inject
    public BananaBeanSet(Set<BananaBean> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "BananaBeanSet{" +
                "set=" + set +
                '}';
    }
}
