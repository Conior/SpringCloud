package com.wsj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class ProviderUserApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication_8002.class,args);
    }
}
