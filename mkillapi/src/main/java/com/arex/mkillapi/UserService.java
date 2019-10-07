package com.arex.mkillapi;


import com.arex.mkillapi.ModelAndView.MkillUserView;

import java.util.List;


/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi
 * 2019/9/21
 */
public interface UserService {

    /**
     * 获取所有用户信息
     *
     * @return
     */
    List<MkillUserView> getUser();

    /**
     * 根据用户id查询用户家的信息
     *
     * @param id
     * @return
     */
    MkillUserView getUserById(int id);

    /**
     * 用户注册或者则定义新增用户
     *
     * @return
     */
    boolean addUser(MkillUserView mkillUserView);

    /**
     * 获取登录者的信息，用于判断登陆者
     *
     * @return
     */
    MkillUserView getLoginUser(String userName, String password);
}
