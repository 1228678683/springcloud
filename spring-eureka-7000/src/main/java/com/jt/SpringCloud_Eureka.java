package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 1.pom.xml添加jar包
 * 2.编辑yml.xml
 * 3.编辑启动项
 * @author PHP
 *
 */
//表示启动时不加载数据源的配置
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaServer   //启动Eureka的服务
public class SpringCloud_Eureka {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloud_Eureka.class, args);
	}

}
