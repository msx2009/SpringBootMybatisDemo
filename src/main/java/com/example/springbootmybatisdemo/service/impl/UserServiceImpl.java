package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.dao.User;
import com.example.springbootmybatisdemo.mapper.UserMapper;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryAll(Integer userId) {
        User loginUser = userMapper.queryAll(userId);
        return loginUser;
    }
}