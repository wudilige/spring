package com.baizhi.lj.action;

import com.baizhi.lj.entity.User;
import com.baizhi.lj.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.http.HttpSession;

/**
 * @Author: LiJin
 * @Date: 2022/8/15
 * @Description:
 */
public class UserAction extends ActionSupport {
    private User user;
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
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
