package com.baizhi.lj.action;

import com.baizhi.lj.entity.User;
import com.baizhi.lj.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * @Author: LiJin
 * @Date: 2022/8/15
 * @Description:
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {
    private User user;
    @Autowired
    private UserService userService;

    HttpSession session= ServletActionContext.getRequest().getSession();
    public String queryAll(){
        session.setAttribute("list",userService.queryAll());
        return "ok";
    }
    public String insert(){
        userService.insert(user);
        return "ok";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
