package com.hzp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ace
 * @create 2018/3/12.
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(GatewayBootstrap.class, args);
    }
}
