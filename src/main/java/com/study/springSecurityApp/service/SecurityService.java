package com.study.springSecurityApp.service;

public interface SecurityService {

    String findLoggedInUsername();
    void autoLogin(String username, String password);

}
