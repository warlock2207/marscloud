package com.mars.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MarsGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarsGatewayApplication.class, args);
        System.out.println("启动成功");
    }
}
