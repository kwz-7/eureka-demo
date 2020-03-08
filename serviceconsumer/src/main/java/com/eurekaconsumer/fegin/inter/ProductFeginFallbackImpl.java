package com.eurekaconsumer.fegin.inter;

import org.springframework.stereotype.Component;

/**
 * Created by FireCode on 2020/3/7.
 */
@Component
public class ProductFeginFallbackImpl implements ProductFeginInterface {
    public String getAllProducts(Long id) {
        return "Feign的服务过忙，请稍后重试。";
    }
}
