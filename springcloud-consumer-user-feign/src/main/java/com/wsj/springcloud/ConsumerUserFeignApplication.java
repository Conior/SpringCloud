package com.wsj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/6 9:07 下午
 */
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = {"com.wsj.springcloud"})
@EnableFeignClients(basePackages = {"com.wsj.springcloud"})
public class ConsumerUserFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserFeignApplication.class,args);
    }
}
