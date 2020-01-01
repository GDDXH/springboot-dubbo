package com.husky.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/10/14
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(helloService.helloWorld("husky"));
        return helloService.helloWorld("husky");
    }
}
