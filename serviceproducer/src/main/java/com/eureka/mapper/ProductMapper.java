package com.eureka.mapper;

import com.eureka.entity.ProductVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by FireCode on 2020/2/18.
 */

public interface ProductMapper extends Mapper<ProductVo> {

   public List<ProductVo> getAllProduct();
}
