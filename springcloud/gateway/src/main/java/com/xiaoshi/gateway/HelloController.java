package com.xiaoshi.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${spring.application.name}")
    String name;
    @RequestMapping("/gateway")
    public String hello(){
        return "网关 ："+name;
    }
}
