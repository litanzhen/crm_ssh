package com.hecun.crm.dao;

import com.hecun.crm.domain.User;

public interface UserDao {
    User getByUsercode(String usercode);
}
