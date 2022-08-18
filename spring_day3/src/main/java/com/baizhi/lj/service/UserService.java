/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
package com.baizhi.lj.service;

public interface UserService {
    void addNormalUser(String name); //添加方法
    void addVIPUser(String name, Integer level); //添加方法
    String findAll(); //查询方法
    String findByName(String name); //查询方法
    String findByLevel(Integer level); //查询方法
}
