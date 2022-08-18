package com.baizhi.lj.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class UserAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("UserService中的方法正常执行--方法级别!");
        System.out.println("UserService中的方法正常执行--类级别!");
    }
}
