package com.mars.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mars.common.security.annotation.EnableCustomConfig;
import com.mars.common.security.annotation.EnableRyFeignClients;
//import com.mars.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author ruoyi
 */
@EnableCustomConfig
//@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class MarsJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MarsJobApplication.class, args);
        System.out.println("定时任务模块启动成功");
    }
}
