/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
package com.baizhi.lj.service;

import com.baizhi.lj.entity.User;

import java.util.List;

public interface UserService {
    //查所有
    public List<User> queryAll();
    //添加
    public void insert(User user);
}
