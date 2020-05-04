package com.sakerini.registrationformdemo.service;

import com.sakerini.registrationformdemo.entity.User;
import com.sakerini.registrationformdemo.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
