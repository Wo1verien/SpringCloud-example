package com.cz.eurekaproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created 2019-09-17.
 *
 * @author changzheng
 */
@RestController

public class EurekaProducerController {
      @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + " " + new Date();
    }
}
