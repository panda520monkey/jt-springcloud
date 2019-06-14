package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @auther: panda
 * @date: 2019/6/14
 * @descripton: com.jt
 * @version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard //启动仪表盘监控程序
public class RunAppDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(RunAppDashBoard.class);
    }
}
