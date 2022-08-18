package com.baizhi.lj.test;

import com.baizhi.lj.service.CityService;
import com.baizhi.lj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.addNormalUser("小王");
//        System.out.println("______________________");
//        userService.addVIPUser("小李",1);
//        System.out.println(userService.findAll());
//        System.out.println(userService.findByLevel(1));
//        userService.findByName("小赵");
    }
    @Test
    public void testError(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=context.getBean("userService",UserService.class);
        CityService cityService=context.getBean("cityService",CityService.class);
        userService.findAll();
        cityService.findAll();
    }


}
