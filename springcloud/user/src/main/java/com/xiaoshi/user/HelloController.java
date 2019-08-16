package com.xiaoshi.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用户相关")
public class HelloController {
    @Value("${spring.application.name}")
    String name;

    @RequestMapping("/userhello")
    public String hello(){
        return "用户业务 ：" + name ;
    }
    @GetMapping("/hello1")
    @ApiOperation(value = "测试方法")
    public String hello1(){
        return "用户业务1 ：" + name ;
    }
}