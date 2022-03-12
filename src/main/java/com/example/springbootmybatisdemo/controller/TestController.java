package com.example.springbootmybatisdemo.controller;

import com.example.springbootmybatisdemo.dao.User;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public String doLogin(Integer userId) {
        User loginUser = userService.queryAll(userId);
        return loginUser.getUserName();
    }

}
