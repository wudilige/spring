package com.baizhi.lj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: LiJin
 * @Date: 2022/8/17
 * @Description:
 */
@Controller
@RequestMapping("a")
public class FirstController {
    @RequestMapping("b")
    public String text() {
        System.out.println("hello,test李津");
        return "index";
    }
    @RequestMapping("/c") //此时这个方法的访问路径就是/a/c
    public String test1(){
        System.out.println("hello test");
        return "redirect:/index.jsp"; //页面逻辑名，会被自动拼接前缀和后缀形成/index.jsp
    }
}
