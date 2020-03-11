package com.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FireCode on 2020/3/10.
 */
@RestController
public class GateController {
    @GetMapping("/teststring")
   public  String getString(){
       return  "***";
   }
}
