package com.baizhi.lj.singleton;

/**
 * @Author: LiJin
 * @Date: 2022/8/10
 * @Description:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    public synchronized static LazySingleton getInstance() {
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
