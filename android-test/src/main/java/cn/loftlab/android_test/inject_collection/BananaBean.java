package cn.loftlab.android_test.inject_collection;

/**
 * Created by Administrator on 2017/9/7.
 */

class BananaBean {
    private String banana;
    public BananaBean(String banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "BananaBean{" +
                "banana='" + banana + '\'' +
                '}';
    }
}
