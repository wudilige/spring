package com.baizhi.lj.controller;

import com.baizhi.lj.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Author: LiJin
 * @Date: 2022/8/17
 * @Description: 使用log4j在控制台输出姓名和生日
 */
@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("receive")
    public String receiveUser(String username,@DateTimeFormat(pattern="yyyy-MM-dd") Date birthday) {
        log.debug(username);
        log.debug(String.valueOf(birthday));
        return "index";
    }
    @RequestMapping("receive2")
    public String receiveUser2(User user){
        log.debug(user.getUsername());
        log.debug(String.valueOf(user.getBirthday()));
        return "index";
    }
}
