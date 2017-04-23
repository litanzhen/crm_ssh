package com.hecun.crm.service.impl;

import com.hecun.crm.dao.UserDao;
import com.hecun.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
}
