package com.cz.nacosconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created 2019-09-17.
 *
 * @author changzheng
 */
@Service
@FeignClient(value = "nacos-producer")
public interface NacosConsumerSercvice {
    @GetMapping("/hello?name=mfw")
    String hi ();
}
