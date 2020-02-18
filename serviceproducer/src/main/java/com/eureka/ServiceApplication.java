package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by FireCode on 2020/2/17.
 */

/**
 * 注意这里的注解也可以是@EnableEurekaClient
 * 但是推荐使用 @EnableDiscoveryClient ,因为@EnableEurekaClient只能把服务注册到
 * Eureka注册中心，但是注册中心不止Eureka一个，springboot也可以使用其它
 * 注册中心，比如：Zookeeper等。但是用@EnableDiscoveryClient就可以同时向其它
 * 注册中心注册
 * */

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.eureka.mapper"})
public class ServiceApplication {
    public static void main(String[] arg){
        SpringApplication.run(ServiceApplication.class);
    }
}
