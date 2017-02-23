package com.zhang.controller;

import com.zhang.entity.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang on 2017/2/22.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "{id}" ,method = RequestMethod.GET)
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "" ,method = RequestMethod.POST)
    public int addUser(User user){
        return userService.addUser(user);
    }
}
