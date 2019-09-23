package com.arex.mkillprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;

import java.util.concurrent.CountDownLatch;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author meisheng
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.arex.mkillprovider.mapper")
public class Application {

	public static void main(String[] args) throws InterruptedException{

		SpringApplication.run(Application.class, args);

		//hold住应用，防止provider退出
		new CountDownLatch(1).await();
	}
	
}
