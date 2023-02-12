package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: atguigu
 * @create: 2023-02-11 11:48
 */
@SpringBootApplication
@MapperScan("com.atguigu.shardingjdbcdemo.mapper")
public class ShardingJDBCDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCDemoApp.class, args);
    }
}
