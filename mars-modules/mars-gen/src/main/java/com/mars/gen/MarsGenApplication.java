package com.mars.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mars.common.security.annotation.EnableCustomConfig;
import com.mars.common.security.annotation.EnableRyFeignClients;
/*import com.mars.common.swagger.annotation.EnableCustomSwagger2;*/

/**
 * 代码生成
 * 
 * @author ruoyi
 */
@EnableCustomConfig
/*@EnableCustomSwagger2   */
@EnableRyFeignClients
@SpringBootApplication
public class MarsGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MarsGenApplication.class, args);
        System.out.println("代码生成模块启动成功");
    }
}
