package com.sakerini.registrationformdemo.dao;

import com.sakerini.registrationformdemo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
