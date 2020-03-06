package com.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by FireCode on 2020/2/18.
 */
//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
    @SpringCloudApplication
public class ConsumerApplication {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    public static void main (String [] arg){
        SpringApplication.run(ConsumerApplication.class);
    }
}
