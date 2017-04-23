package com.hecun.crm.web.action;

import com.hecun.crm.domain.User;
import com.hecun.crm.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    //模型驱动
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    @Autowired
    private UserService userService;
}
