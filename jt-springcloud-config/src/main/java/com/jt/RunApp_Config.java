package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther: panda
 * @date: 2019/6/15
 * @descripton: com.jt
 * @version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//排除数据源启动,否则会报错
@EnableConfigServer        //开启配置中心设置
public class RunApp_Config {
        public static void main(String[] args) {
            SpringApplication.run(RunApp_Config.class, args);
        }
}
