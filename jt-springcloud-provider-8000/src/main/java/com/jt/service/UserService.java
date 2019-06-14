package com.jt.service;

import com.jt.pojo.User;

import java.util.List;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt.service
 * @version: 1.0
 */
public interface UserService {
    List<User> findAll();
}
