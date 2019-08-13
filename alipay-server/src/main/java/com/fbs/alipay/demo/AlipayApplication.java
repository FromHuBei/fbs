package com.fbs.alipay.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.fbs.alipay.demo.mapper")
@ServletComponentScan
public class AlipayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlipayApplication.class, args);
    }

}
