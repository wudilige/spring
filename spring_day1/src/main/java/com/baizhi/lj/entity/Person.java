package com.baizhi.lj.entity;

import java.util.Date;

/**
 * @Author: LiJin
 * @Date: 2022/8/11
 * @Description: 单例模式
 */
public class Person {
    private String name;
    private Integer age;
    private Date bir;

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public void setBir(Date bir) {
        this.bir = bir;
    }
    public void test(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(bir);
    }
}

