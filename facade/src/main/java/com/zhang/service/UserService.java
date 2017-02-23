package com.zhang.service;

import com.zhang.entity.User;

/**
 * Created by zhang on 2017/2/22.
 */
public interface UserService {

    public User getUser(String id);

    public int addUser(User user);
}
