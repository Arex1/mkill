package com.arex.mkillconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi
 * 2019/9/21
 */
@EnableDubbo
@SpringBootApplication
public class MkillconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MkillconsumerApplication.class, args);
    }

}
