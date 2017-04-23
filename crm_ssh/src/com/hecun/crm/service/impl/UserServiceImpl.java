package com.hecun.crm.service.impl;

import com.hecun.crm.dao.UserDao;
import com.hecun.crm.domain.User;
import com.hecun.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public User getUserByCodePassword(User user) {
        //1.根据用户名查询用户
        User existU = userDao.getByUsercode(user.getUser_code());
        //2.判断用户是否存在,如果不存在,抛出异常,提示用户名不存在
        if (existU == null){
            throw new RuntimeException("用户名不存在!");
        }
        //3.判断用户密码是否正确,如果不正确,抛出异常,提示密码错误
        if(!existU.getUser_password().equals(user.getUser_password())){
            throw new RuntimeException("密码错误!");
        }
        //4.返回查询到的用户
        return existU;
    }
}
