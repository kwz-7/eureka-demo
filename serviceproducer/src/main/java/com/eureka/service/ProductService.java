package com.eureka.service;

import com.eureka.entity.ProductVo;
import com.eureka.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by FireCode on 2020/2/18.
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<ProductVo> getAllProduct(){
        return productMapper.selectAll();
    }
}
