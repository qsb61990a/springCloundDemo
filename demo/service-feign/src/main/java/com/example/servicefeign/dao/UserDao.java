package com.example.servicefeign.dao;

import com.example.servicefeign.model.User;

import java.util.List;

public interface UserDao {
        int insert(User record);

        User selectByPrimaryKey(Integer id);

        List<User> getAllUsers();
    }
