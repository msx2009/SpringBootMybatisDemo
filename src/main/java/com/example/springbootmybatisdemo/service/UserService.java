package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.dao.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User queryAll(Integer userId);
}
