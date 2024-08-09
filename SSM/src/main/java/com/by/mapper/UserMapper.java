package com.by.mapper;

import com.by.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void insertUser(User user);

    User getUser(@Param("username") String username,@Param("password") String password);
}
