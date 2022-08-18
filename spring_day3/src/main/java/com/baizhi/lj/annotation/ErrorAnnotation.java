package com.baizhi.lj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //代表该注解能作用在方法上
@Retention(RetentionPolicy.RUNTIME) //代表该注解在运行时注解
public @interface ErrorAnnotation {
}
