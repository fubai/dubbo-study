package com.zhang.controller;

import com.zhang.entity.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhang on 2017/2/22.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }
}
