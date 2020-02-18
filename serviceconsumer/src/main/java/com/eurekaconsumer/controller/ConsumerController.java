package com.eurekaconsumer.controller;

import com.eurekaconsumer.entity.ProductVo;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

/**
 * Created by FireCode on 2020/2/18.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/getAllProduct")
    public String getAllProduct(){
        /**第一步获取服务实例。
         * 参数是实例id(服务id),也就是我们定义的spring.application.name参数
         * 返回结果是个集合，因为我们的服务会做集群，不止一个，但是服务id都为同一个，
         * 当一个服务比如：serviceproducer这个服务，发布到多个服务器上时，在注册中心的页面上的
         * Availability Zones就会有多个。
         * 我们根据服务id也就时页面上的 Application得到其中一个实例。
         * */
        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-service.producer");
        //第二步： 从实例中获取服务的具体地址,我们这里只有一个服务，所以只用第一个
        ServiceInstance serviceInstance = instances.get(0);
        //第三步： 从服务实例中获取ip+port
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String uri="http://"+host+":"+port+"/getProducts";
        String vos = restTemplate.getForObject(uri, String.class);
       // List<ProductVo> productVos = Arrays.asList(forObject);
        return vos;
    }
}
