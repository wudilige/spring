package com.baizhi.lj.dao;

import com.baizhi.lj.dao.UserDao;

/**
 * @Author: LiJin
 * @Date: 2022/8/11
 * @Description: 单例模式创建
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void test() {
        System.out.println("方法被调用了");
    }
}
