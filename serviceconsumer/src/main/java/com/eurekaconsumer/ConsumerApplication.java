package com.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by FireCode on 2020/2/18.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    public static void main (String [] arg){
        SpringApplication.run(ConsumerApplication.class);
    }
}
