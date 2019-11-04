package com.arex.mkillapi.service;


import com.arex.mkillapi.dto.*;

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
    List<MkUserView> getUser();

    /**
     * 根据用户id查询用户家的信息
     *
     * @param id
     * @return
     */
    MkUserView getUserById(int id);

    /**
     * 用户注册或者则定义新增用户
     *
     * @return
     */
    boolean addUser(MkUserView mkUserView);

    /**
     * 判断用户是否存在
     *
     * @param userName
     * @param password
     * @return
     */
    boolean getLoginUser(String userName, String password);

    /**
     * 根据用户名获取后台管理员
     */
    MkUserView getAdminByUsername(String username);

    /**
     * 注册功能
     */
    MkUserView register(LoginParam loginParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 刷新token的功能
     *
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     */
    MkUserView getItem(Long id);

    /**
     * 根据用户名或昵称分页查询用户
     */
    List<MkUserView> list(String name, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     */
    int update(Long id, MkUserView user);

    /**
     * 删除指定用户
     */
    int delete(Long id);

    /**
     * 修改用户角色关系
     */
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对于角色
     */
    List<MkRole> getRoleList(Long adminId);

    /**
     * 修改用户的+-权限
     */
    int updatePermission(Long adminId, List<Long> permissionIds);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<MkPermission> getPermissionList(Long adminId);

    /**
     * 修改密码
     */
    int updatePassword(UpdateUserPasswordParam updatePasswordParam);
}
