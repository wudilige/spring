package com.baizhi.lj.service;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class CityServiceImpl implements CityService {
    @Override
    public void addCity(String name) {
        System.out.println("添加方法");
    }

    @Override
    public String findAll() {
        int a=1/0;
        return "查询方法";
    }
}
