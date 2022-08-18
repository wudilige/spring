package com.baizhi.lj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: LiJin
 * @Date: 2022/8/17
 * @Description:
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @RequestMapping("check")
    public String login(String username, String password, HttpServletRequest request, HttpSession session) {
        String dbUsername = "admin";
        String dbPassword = "123";
        if(dbUsername.equals(username)&&dbPassword.equals(password)){
            session.setAttribute("username",username);
            return "loginSuccess";
        }else{
            request.setAttribute("error","信息错误，请重试！");
            return "login";
        }
    }
}
