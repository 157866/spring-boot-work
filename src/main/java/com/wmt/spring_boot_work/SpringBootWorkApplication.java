package com.wmt.spring_boot_work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wmt.spring_boot_work.mappers")
public class SpringBootWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWorkApplication.class, args);
    }

}
