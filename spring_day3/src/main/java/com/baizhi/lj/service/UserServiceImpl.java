package com.baizhi.lj.service;

import com.baizhi.lj.annotation.ErrorAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserServiceImpl.class);
//    LoggerFactory
    @Override
    @ErrorAnnotation
    public void addNormalUser(String name) {
//        System.out.println(111);
//        int a=1/0;
        LOGGER.debug("添加方法1"+name);
        //System.out.println();
    }

    @Override
    public void addVIPUser(String name, Integer level) {
        System.out.println("添加方法2"+name+"---"+level);

    }

    @Override
    public String findAll() {
//        int a=1/0;
        return "查询方法1";
    }

    @Override
    public String findByName(String name) {
        return "查询方法2";
    }

    @Override
    public String findByLevel(Integer level) {
        return "查询方法3";
    }
}
