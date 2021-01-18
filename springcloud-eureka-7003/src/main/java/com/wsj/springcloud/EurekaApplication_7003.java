package com.wsj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/7 11:02 下午
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7003.class,args);
    }
}
