package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@MapperScan("com.lagou.company.mapper")//创建自己的包
@EnableEurekaClient
@EnableHystrix        //开启断路器机制
public class search_provider_8082 {
    public static void main(String[] args) {
        SpringApplication.run(search_provider_8082.class);
    }
}
