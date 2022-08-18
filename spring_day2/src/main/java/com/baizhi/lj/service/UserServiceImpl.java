package com.baizhi.lj.service;

import com.baizhi.lj.dao.UserDao;

/**
 * @Author: LiJin
 * @Date: 2022/8/11
 * @Description:
 */
public class UserServiceImpl implements UserService{
    //123
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void test() {
        System.out.println(userDao);
    }
}
