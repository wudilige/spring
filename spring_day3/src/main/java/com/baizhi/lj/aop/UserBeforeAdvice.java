package com.baizhi.lj.aop;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class UserBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("即将执行UserService的添加方法!");
    }
}
