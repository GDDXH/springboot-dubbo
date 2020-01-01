package com.husky.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.HelloService;

/**
 * @author shency
 * @description: TODO
 * @date: 2019/10/14
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloWorld(String name) {
        return "Hello world " + name;
    }
}
