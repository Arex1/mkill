package com.arex.mkillprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.arex.mkillapi.dto.*;
import com.arex.mkillapi.service.UserService;
import com.arex.mkillprovider.mapper.MkillUserMapper;
import com.arex.mkillprovider.model.users.MkUser;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private MkillUserMapper userMapper;

    @Override
    public List<MkUserView> getUser() {

        List<MkUser> mkUsers = userMapper.selectList(null);
        List<MkUserView> userViews = new ArrayList<>(10);
        for (MkUser mkUser : mkUsers) {
            MkUserView userView = new MkUserView();
            BeanUtils.copyProperties(mkUser, userView);
            userViews.add(userView);
        }
        return userViews;
    }

    @Override
    public MkUserView getUserById(int id) {
        return null;
    }

    @Override
    public boolean addUser(MkUserView mkUserView) {

        MkUser user = new MkUser();
        BeanUtils.copyProperties(mkUserView,user);
        int insert = userMapper.insert(user);

        return insert>0;
    }

    @Override
    public boolean getLoginUser(String userName, String password) {
        return false;
    }

    @Override
    public MkUserView getAdminByUsername(String username) {
        return null;
    }

    @Override
    public MkUserView register(LoginParam loginParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String refreshToken(String oldToken) {
        return null;
    }

    @Override
    public MkUserView getItem(Long id) {
        return null;
    }

    @Override
    public List<MkUserView> list(String name, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int update(Long id, MkUserView user) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleIds) {
        return 0;
    }

    @Override
    public List<MkRole> getRoleList(Long adminId) {
        return null;
    }

    @Override
    public int updatePermission(Long adminId, List<Long> permissionIds) {
        return 0;
    }

    @Override
    public List<MkPermission> getPermissionList(Long adminId) {
        return null;
    }

    @Override
    public int updatePassword(UpdateUserPasswordParam updatePasswordParam) {
        return 0;
    }


}
