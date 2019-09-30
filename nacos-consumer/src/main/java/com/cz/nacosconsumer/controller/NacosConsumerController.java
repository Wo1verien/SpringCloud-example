package com.cz.nacosconsumer.controller;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.cz.nacosconsumer.service.NacosConsumerSercvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created 2019-09-17.
 *
 * @author changzheng
 */
@RestController
@Slf4j
public class NacosConsumerController {
    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = client.choose("nacos-producer");
        String url = serviceInstance.getUri() + "/hello?name=" + "didi";
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }
    @GetMapping("/ribbonTest")
    public String test1() {
        String url="http://nacos-producer/hello?name=mfw";
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    @Autowired
    private NacosConsumerSercvice consumerSercvice;
    @GetMapping("/feignTest")
    public String test2(){
        return consumerSercvice.hi();
    }
}
