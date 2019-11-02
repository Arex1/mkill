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
public interface UserService{

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
     * 判断用户是否存在
     *
     * @param userName
     * @param password
     * @return
     */
    boolean getLoginUser(String userName, String password);
}
