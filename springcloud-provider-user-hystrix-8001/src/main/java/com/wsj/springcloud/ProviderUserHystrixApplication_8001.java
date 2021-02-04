package com.wsj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/5 10:02 下午
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker   // 开启对熔断对支持
public class ProviderUserHystrixApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserHystrixApplication_8001.class,args);
    }
}
