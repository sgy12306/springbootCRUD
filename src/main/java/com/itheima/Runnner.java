package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
//开启缓存
@EnableCaching
@EnableTransactionManagement
public class Runnner {
    public static void main(String[] args) {
        SpringApplication.run(Runnner.class, args);
    }
}
