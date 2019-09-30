package com.cz.nacosproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created 2019-09-17.
 *
 * @author changzheng
 */
@RestController
@Slf4j
public class NacosProducerController {

    @Value("${server.port}")
    private String port;
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name  + ", producer port is " + port;
    }

    @GetMapping("test")
    public String test(){
        return "port is " + port;
    }
}

