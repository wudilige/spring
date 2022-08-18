package com.baizhi.lj.test;

import com.baizhi.lj.dao.UserDao;
import com.baizhi.lj.entity.Abc;
import com.baizhi.lj.entity.Person;
import com.baizhi.lj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: LiJin
 * @Date: 2022/8/11
 * @Description:
 */
public class TestSpring {
    //单例模式
    @Test
    public void Test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Person person1 = applicationContext.getBean("person",Person.class);
        Person person2 = applicationContext.getBean("person",Person.class);
        Person person3 = applicationContext.getBean("person",Person.class);
        person1.test();
        System.out.println("-----------");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
    //非单例模式
    @Test
    public void Test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Abc abc1 = applicationContext.getBean("abc", Abc.class);
        Abc abc2 = applicationContext.getBean("abc",Abc.class);
        Abc abc3 = applicationContext.getBean("abc",Abc.class);
        System.out.println(abc1);
        System.out.println(abc2);
        System.out.println(abc3);
    }
    //单例模式
    @Test
    public void Test3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao1 = applicationContext.getBean("userDao", UserDao.class);
        UserDao userDao2 = applicationContext.getBean("userDao",UserDao.class);
        UserDao userDao3 = applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        System.out.println(userDao3);
    }
    //SET注入
    @Test
    public void Test4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.test();
    }
    //自动注入byType
    @Test
    public void Test5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService2", UserService.class);
        userService.test();
    }
    //自动注入byName
    @Test
    public void Test6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService3", UserService.class);
        userService.test();
    }
}
