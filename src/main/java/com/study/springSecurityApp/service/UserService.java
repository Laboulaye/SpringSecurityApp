package com.study.springSecurityApp.service;

import com.study.springSecurityApp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}