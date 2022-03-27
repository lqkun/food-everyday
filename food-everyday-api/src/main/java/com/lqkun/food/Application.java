package com.lqkun.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @className: com.lqkun.food.controller-> Application
 * @description: TODO
 * @author: LQKun
 * @date: 2022-03-20 21:35
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lqkun.food.mapper")
@ComponentScan(basePackages = {"com.lqkun.food", "org.n3r.idworker"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
