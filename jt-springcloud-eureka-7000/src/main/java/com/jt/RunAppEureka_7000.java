package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt
 * @version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class RunAppEureka_7000 {
    public static void main(String[] args) {
        SpringApplication.run(RunAppEureka_7000.class);
    }
}
