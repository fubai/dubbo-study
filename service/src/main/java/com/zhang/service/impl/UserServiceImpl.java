package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.entity.User;
import com.zhang.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by zhang on 2017/2/22.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public User getUser(String id) {
        return userDao.selectByPrimaryKey(id);
    }
}
