package com.mars.system;

//import com.mars.common.security.annotation.EnableCustomConfig;

import com.mars.common.security.annotation.EnableCustomConfig;
import com.mars.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 */
@EnableCustomConfig
//@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class MarsSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarsSystemApplication.class, args);
        System.out.println("系统模块启动");
    }
}
