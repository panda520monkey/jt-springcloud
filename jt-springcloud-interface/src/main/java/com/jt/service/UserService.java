package com.jt.service;

import com.jt.factory.UserServiceFallBackFactory;
import com.jt.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther: panda
 * @date: 2019/6/14
 * @descripton: com.jt.service
 * @version: 1.0
 */
@FeignClient(value = "provider-user",fallbackFactory = UserServiceFallBackFactory.class) //服务的名称
public interface UserService {
    @RequestMapping("findAll")
     List<User> findAll();

    @RequestMapping("hello")
     String hello();

    @RequestMapping("hi")
    String hi();
}
