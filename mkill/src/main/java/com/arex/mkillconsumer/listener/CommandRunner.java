package com.arex.mkillconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.listener
 * 2019/10/3
 */
@Component
public class CommandRunner implements CommandLineRunner {

    protected static final Logger logger = LoggerFactory.getLogger(CommandRunner.class);

    @Override
    public void run(String... args) throws Exception {
        try {
            // 监听项目启动，打开第一个页面
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8521/admin");
            logger.info("打开第一个页面 http://localhost:8521/admin");
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error(String.format("%s", ex));
        }
    }
}
