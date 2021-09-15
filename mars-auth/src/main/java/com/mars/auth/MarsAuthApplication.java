package com.mars.auth;

import com.mars.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MarsAuthApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MarsAuthApplication.class, args);
        System.out.println("权限模块启动");
    }
}
