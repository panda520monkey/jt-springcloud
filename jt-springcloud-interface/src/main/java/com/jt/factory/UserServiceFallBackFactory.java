package com.jt.factory;

import com.jt.pojo.User;
import com.jt.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: panda
 * @date: 2019/6/14
 * @descripton: com.jt.factory
 * @version: 1.0
 */
@Component
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> findAll() {
                User user = new User();
                user.setAge(0).setId(0).setName("-------").setSex("");
                List<User> userList = new ArrayList<>();
                userList.add(user);
                return userList;
            }

            @Override
            public String hello() {
                return "interface8000出问题了";
            }

            @Override
            public String hi() {
                return "我是hihihi 我粗问题了么";
            }
        };
    }
}
