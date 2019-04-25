package com.example.servicefeign.service;

import com.example.servicefeign.dao.UserDao;
import com.example.servicefeign.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

@Autowired
private UserDao userDao;

    public int insert(User user){
        return userDao.insert(user);
    }

    public User selectByPrimaryKey(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}