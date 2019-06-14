package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt
 * @version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("hello")
    public String hello(){
        return "我是8001";
    }
}
