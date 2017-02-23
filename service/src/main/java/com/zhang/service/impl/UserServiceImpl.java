package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.entity.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhang on 2017/2/22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(String id) {
        return userDao.selectByPrimaryKey(id);
    }

    public int addUser(User user) {
        return userDao.insert(user);
    }
}
