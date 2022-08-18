package com.baizhi.lj.test;


import com.baizhi.lj.service.UserService;
import com.baizhi.lj.service.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    private final UserService userService = new UserServiceImpl();

    @Test
    public void test1(){
        //获得当前线程类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //提供代理类需要实现的接口
        Class[] interfaces = {UserService.class};
        //需要执行的额外操作（通过接口回调实现）
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(proxy.getClass());
//                System.out.println("invoke被调用了");
//                System.out.println("调用的方法" + method);
//                for (Object arg : args) {
//                    System.out.println("参数：" + arg);
//                }
//                System.out.println("-------------------------");
                Object invoke = null;
                try {
                    System.out.println("开启事务");

                    invoke = method.invoke(userService, args);
                    System.out.println("提交事务");
                }catch (Exception e){
//                    e.printStackTrace();
                    System.out.println("回滚事务");
                }


                return invoke;
            }
        };

        //创建一个代理对象
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, handler);
        System.out.println(userServiceProxy.getClass());
//        userServiceProxy.save("123");
//        userServiceProxy.delete("2");
//        userServiceProxy.update();
//        userServiceProxy.save("测试");
//        String s = userServiceProxy.find();
//        System.out.println("---" + s);
    }
}
