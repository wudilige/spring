package com.baizhi.lj.controller;

import com.baizhi.lj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: LiJin
 * @Date: 2022/8/17
 * @Description:
 */
@Controller
@RequestMapping("list")
public class ListController {
    @RequestMapping("users")
    public String testList(HttpServletRequest request) {
        List<User> users = new ArrayList<>();
        users.add(new User("张三",new Date()));
        users.add(new User("李四",new Date()));
        users.add(new User("王五",new Date()));
        request.setAttribute("users",users);
        return "listShow";
    }
}
