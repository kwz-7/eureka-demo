package com.eureka.controller;

import com.eureka.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FireCode on 2020/2/18.
 */
@RestController
public class ApplicationRestController {
    @Autowired
    private ProductService productService;
    @GetMapping("/getProducts")
    public String getAllProduct(){
        return productService.getAllProduct().toString();
    }
}
