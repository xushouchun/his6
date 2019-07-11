package com.neuedu.his.menzhen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //代表允许当前节点使用feign的api远程访问其他服务
public class MenZhenApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenZhenApplication.class,args);
    }
}
