package com.baizhi.lj.pojo;

public class Person {
    public String test(){
        System.out.println("测试");
        return "test";
    }

    public String test(String name, Integer age){
        System.out.println("测试" + name + age);
        return "test";
    }
}
