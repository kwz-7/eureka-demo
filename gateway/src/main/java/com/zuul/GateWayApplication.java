package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Created by FireCode on 2020/3/9.
 */
@SpringBootApplication
@EnableZuulProxy

public class GateWayApplication {
  public static void main(String[] arsg){
      SpringApplication.run(GateWayApplication.class);
  }
}
