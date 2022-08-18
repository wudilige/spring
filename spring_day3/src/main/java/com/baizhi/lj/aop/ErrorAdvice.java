package com.baizhi.lj.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @Author: LiJin
 * @Date: 2022/8/12
 * @Description:
 */
public class ErrorAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("查询方法出现了异常，异常信息为:"+e.getMessage());
    }
}
