package com.zhang.entity;

import java.io.Serializable;

/**
 * Created by zhang on 2017/2/22.
 */
public class User implements Serializable {
    private String name;
    private String password;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
