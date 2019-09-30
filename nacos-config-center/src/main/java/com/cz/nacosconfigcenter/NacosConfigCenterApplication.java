package com.cz.nacosconfigcenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changzheng
 */
@SpringBootApplication
public class NacosConfigCenterApplication {

		public static void main(String[] args) {
			SpringApplication.run(NacosConfigCenterApplication.class, args);
		}


}
