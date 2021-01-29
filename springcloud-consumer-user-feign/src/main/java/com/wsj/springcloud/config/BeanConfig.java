package com.wsj.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/6 8:49 下午
 */
//@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced // ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
