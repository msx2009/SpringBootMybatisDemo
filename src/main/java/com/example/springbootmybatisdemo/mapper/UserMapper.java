package com.example.springbootmybatisdemo.mapper;


import com.example.springbootmybatisdemo.dao.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User queryAll(Integer userId);
}
