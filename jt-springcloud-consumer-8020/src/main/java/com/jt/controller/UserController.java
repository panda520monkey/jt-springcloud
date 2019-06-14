package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt
 * @version: 1.0
 */
@RestController
public class UserController {
   /* private static final String providerUrl = "http://provider-user/";
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer/findAll")
    public List<User> findAll() {
        String url = providerUrl + "findAll";
        return restTemplate.getForObject(url, List.class);
    }
    @RequestMapping("/consumer/hello")
    public String hello() {
        String url = providerUrl + "hello";
        return restTemplate.getForObject(url, String.class);
    }*/

    @Autowired
    UserService userService;

    @RequestMapping("/consumer/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/consumer/hello")
    public String hello() {
        return userService.hello();
    }
    @RequestMapping("/consumer/hi")
    public String hi() {
        return userService.hi();
    }
}
