package com.hecun.crm.service;

import com.hecun.crm.domain.User;

public interface UserService {

    User getUserByCodePassword(User user);
}
