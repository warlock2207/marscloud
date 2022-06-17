package com.mars.game;

import com.mars.common.security.annotation.EnableCustomConfig;
import com.mars.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 游戏管理模块
 */
@EnableCustomConfig
//@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class MarsGameApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarsGameApplication.class, args);
        System.out.println("游戏管理模块");
    }
}
