package com.example.servicefeign.controller;

import com.example.servicefeign.model.User;
import com.example.servicefeign.service.UserService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value="/insert",method= RequestMethod.POST)
    @ResponseBody
    public int insert(@RequestBody User user){
        return userService.insert(user);
    }

    @RequestMapping(value="/selectByPrimaryKey",method=RequestMethod.GET)
    @ResponseBody
    public User selectByPrimaryKey(){
        Integer id = 1;
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping(value="/getAllUsers",method=RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> listUser = userService.getAllUsers();
        return listUser;
    }
}
