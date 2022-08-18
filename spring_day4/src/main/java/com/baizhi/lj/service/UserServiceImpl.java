package com.baizhi.lj.service;

import com.baizhi.lj.dao.UserDao;
import com.baizhi.lj.entity.User;

import java.util.List;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
