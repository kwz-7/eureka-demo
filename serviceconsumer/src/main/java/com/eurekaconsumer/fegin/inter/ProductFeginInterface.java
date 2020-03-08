package com.eurekaconsumer.fegin.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by FireCode on 2020/3/7.
 */
@FeignClient(value = "EUREKA-SERVICE.PRODUCER",fallback = ProductFeginFallbackImpl.class)
public interface ProductFeginInterface {
    @GetMapping("/getProducts/{id}")
    public String getAllProducts(@PathVariable("id") Long id);
}
