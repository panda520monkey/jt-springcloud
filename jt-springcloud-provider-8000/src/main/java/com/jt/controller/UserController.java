package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    @HystrixCommand(fallbackMethod = "hystrix_findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("hello")
    public String hello(){
        return "我是8000的hello";
    }
    @RequestMapping("hi")
    public String hi(){
        return "我是8000的hihihihi";
    }

    public List<User> hystrix_findAll(){
        User user = new User();
        user.setAge(999).setId(88).setName("").setSex("");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return userList;
    }
}
