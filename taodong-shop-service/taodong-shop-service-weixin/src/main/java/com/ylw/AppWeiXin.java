package com.ylw;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
@EnableFeignClients
//@EnableApolloConfig
@ComponentScan(basePackages = "com.ylw")
public class AppWeiXin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class, args);
    }

}