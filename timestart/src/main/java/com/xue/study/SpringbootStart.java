package com.xue.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStart.class, args);
    }
}
