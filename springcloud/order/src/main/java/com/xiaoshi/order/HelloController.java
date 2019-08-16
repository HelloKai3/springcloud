package com.xiaoshi.order;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("订单相关")
public class HelloController {
    @Value("${spring.application.name}")
    String name;

    @GetMapping("/hello")
    @ApiOperation(value = "订单测试接口")
    public String hello(){
        return "订单业务 ：" + name ;
    }
}
