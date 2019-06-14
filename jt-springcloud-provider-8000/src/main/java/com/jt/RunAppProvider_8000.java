package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.jt.mapper")
@EnableEurekaClient
@EnableHystrix
public class RunAppProvider_8000 {
    public static void main(String[] args) {
        SpringApplication.run(RunAppProvider_8000.class);
    }
}
