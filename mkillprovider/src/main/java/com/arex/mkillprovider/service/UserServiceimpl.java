package com.arex.mkillprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.UserService;
import com.arex.mkillapi.model.MkillUser;
import com.arex.mkillprovider.mapper.MkillUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.service
 * 2019/9/21
 */
@Service(version = "1.0.0")
public class UserServiceimpl implements UserService {

    @Autowired
    private MkillUserMapper userMapper;

    @Override
    public List<MkillUserView> getUser() {

        List<MkillUser> mkillUsers = userMapper.selectAll();
        List<MkillUserView> userViews = new ArrayList<>(10);
        for (MkillUser mkillUser: mkillUsers) {
            MkillUserView userView = new MkillUserView();
            BeanUtils.copyProperties(mkillUser,userView);
            userViews.add(userView);
        }
        return userViews;
    }
}
