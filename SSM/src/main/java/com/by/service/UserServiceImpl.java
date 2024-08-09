package com.by.service;

import com.by.mapper.UserMapper;
import com.by.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getUser(String username, String password) {
        return userMapper.getUser(username,password);
    }
}
