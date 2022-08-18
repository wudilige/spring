package com.baizhi.lj.service;

import com.baizhi.lj.dao.UserDao;
import com.baizhi.lj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
