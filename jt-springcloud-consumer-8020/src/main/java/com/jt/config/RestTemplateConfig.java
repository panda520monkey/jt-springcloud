package com.jt.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt.config
 * @version: 1.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule getIRule() {
        /*
        * Robbin均衡策略:
        * RoundRobinRule            轮询策略
        * RandomRule                随机策略
        * AvailabilityFilteringRule 首先会过滤掉故障机或者并发链接数超过阈值的服务器.剩余的机器轮询配置
        * WeightedResponseTimeRule  服务器影响时间越快,则权重越高
         *BestAvailableRule         最大可用策略，即先过滤出故障服务器后，选择一个当前并发请求数最小的
         */

        return new RoundRobinRule();
    }
}
