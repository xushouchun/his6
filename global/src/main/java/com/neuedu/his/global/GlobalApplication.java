package com.neuedu.his.global;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//扫包
@MapperScan("com.neuedu.his.global.dao")
public class GlobalApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalApplication.class,args);
    }
}
