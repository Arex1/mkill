package com.arex.mkillprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author meisheng
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.arex.mkillprovider.mapper")
public class Application {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(Application.class, args);

        //hold住应用，防止provider退出
        new CountDownLatch(1).await();
    }

}
