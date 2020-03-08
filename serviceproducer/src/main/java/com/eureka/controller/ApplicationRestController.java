package com.eureka.controller;

import com.eureka.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FireCode on 2020/2/18.
 */
@RestController
public class ApplicationRestController {
    @Autowired
    private ProductService productService;
    @GetMapping("/getProducts/{id}")
    public String getAllProduct(@PathVariable  Long id){

        if (id%2==0){
         throw new RuntimeException();
        }
        return productService.getAllProduct().toString();
    }
}
