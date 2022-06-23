package com.cheng.myblog.service;

import com.cheng.myblog.mapper.UserMapper;
import com.cheng.myblog.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.addUser(user);
    }

    public User selectByName(String username){
        return userMapper.selectByName(username);
    }

    public User selectById(Integer userId){
        return userMapper.selectById(userId);
    }
}
