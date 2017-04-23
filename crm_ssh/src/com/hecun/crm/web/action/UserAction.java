package com.hecun.crm.web.action;

import com.hecun.crm.domain.User;
import com.hecun.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    //模型驱动
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    @Autowired
    private UserService userService;
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public String login(){
        //1.调用Service执行登录逻辑
        User u = userService.getUserByCodePassword(user);
        //2.将返回的user对象存入session中
        ActionContext.getContext().getSession().put("user", u);
        //3.重定向到项目首页
        return "toHome";
    }
}
