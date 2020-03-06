package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by FireCode on 2020/2/17.
 */
@SpringBootApplication
@EnableEurekaServer

public class EurekaApplication {
   public static void main (String [] args){
       SpringApplication.run(EurekaApplication.class);
       return;
   }
}
