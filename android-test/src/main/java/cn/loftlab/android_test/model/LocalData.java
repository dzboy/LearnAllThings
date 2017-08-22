package cn.loftlab.android_test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 */

public class LocalData {
    public List<String> getDataList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("String : " + i);
        }
        return list;
    }

    public List<String> getRightDataList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if ( i % 2 == 0 )
            list.add("String : " + i);
        }
        return list;
    }
}
