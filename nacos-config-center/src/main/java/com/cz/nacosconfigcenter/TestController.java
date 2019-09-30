package com.cz.nacosconfigcenter;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import com.mafengwo.corp.cloud.nacos.config.annotation.ConfigValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * Created 2019-09-18.
 *
 * @author changzheng
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${my.slogan}")
    private String slogan;

    @GetMapping("/test")
    public String test() {
        return slogan;
    }

}
