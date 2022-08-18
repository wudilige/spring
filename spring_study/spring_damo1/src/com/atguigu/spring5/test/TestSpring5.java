package com.atguigu.spring5.test;

import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //加载spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

}
