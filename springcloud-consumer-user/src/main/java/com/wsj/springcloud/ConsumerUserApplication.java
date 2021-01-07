package com.wsj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/6 9:07 下午
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConsumerUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class,args);
    }
}
