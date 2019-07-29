package com.study.springSecurityApp.controller;

import com.study.springSecurityApp.model.User;
import com.study.springSecurityApp.service.SecurityService;
import com.study.springSecurityApp.service.UserService;
import com.study.springSecurityApp.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("iserForm", new User());
        return "registration";
    }

}
