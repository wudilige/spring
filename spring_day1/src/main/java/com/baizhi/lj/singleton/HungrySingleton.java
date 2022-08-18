package com.baizhi.lj.singleton;

/**
 * @Author: LiJin
 * @Date: 2022/8/10
 * @Description:
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
