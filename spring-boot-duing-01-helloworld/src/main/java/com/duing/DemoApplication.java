package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 申明我们的入口类  并且申明是springboot项目
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法，启动springboot程序
        //该静态方法有2个参数：程序的入口类 main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
