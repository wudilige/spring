package com.baizhi.lj.test;

import com.baizhi.lj.pojo.A;
import com.baizhi.lj.singleton.HungrySingleton;
import com.baizhi.lj.singleton.LazySingleton;
import org.junit.Test;

/**
 * @Author: LiJin
 * @Date: 2022/8/10
 * @Description:
 */
public class TestJava {
    @Test
    public void test1(){
        HungrySingleton h1=HungrySingleton.getInstance();
        HungrySingleton h2=HungrySingleton.getInstance();
        System.out.println(h1==h2);
    }
    @Test
    public void test2(){
        LazySingleton l1=LazySingleton.getInstance();
        LazySingleton l2=LazySingleton.getInstance();
        System.out.println(l1==l2);
    }
    @Test
    public void test3() throws Exception {
        A o=(A) Class.forName("com.baizhi.lj.pojo.A").newInstance();
        System.out.println(o.name);
    }
}
