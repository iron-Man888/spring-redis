package com.by.service;

import com.by.pojo.User;

public interface UserService {


    void insertUser(User user);

    User getUser(String username,String password);

}
