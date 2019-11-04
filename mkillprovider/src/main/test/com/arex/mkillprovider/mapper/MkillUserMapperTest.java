package com.arex.mkillprovider.mapper;


import com.arex.mkillprovider.model.users.MkUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.mapper
 * 2019/11/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MkillUserMapperTest {

    @Autowired
    private MkillUserMapper userMapper;

    @Test
    public void insertUser() {
        int mkUsers = 0;
        log.info("添加用户数据------start");
        for (int i = 0; i < 10; i++) {
            MkUser user = new MkUser();
            user.setName(UUID.randomUUID().toString().substring(16));
            user.setCreatedAt(LocalDateTime.now());
            user.setSalt(UUID.randomUUID().toString());
            user.setUserName("张三" + i);
            user.setPassword("1771756470"+i);
            mkUsers = userMapper.insert(user);
        }
        System.out.println("添加了" + mkUsers);
        log.info("添加用户数据------end");
    }

    @Test
    public void getUser() {
        log.info("获取用户数据------start");
        List<MkUser> mkUsers = userMapper.selectList(null);
        mkUsers.forEach(System.out::println);
        log.info("获取用户数据------end");
    }
}