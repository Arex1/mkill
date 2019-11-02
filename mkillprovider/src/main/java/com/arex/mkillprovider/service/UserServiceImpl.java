package com.arex.mkillprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.arex.mkillapi.modelview.MkillUserView;
import com.arex.mkillapi.service.UserService;
import com.arex.mkillapi.model.users.*;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private MkillUserMapper userMapper;

    @Override
    public List<MkillUserView> getUser() {

        List<MkillUser> mkillUsers = userMapper.selectList(null);
        List<MkillUserView> userViews = new ArrayList<>(10);
        for (MkillUser mkillUser : mkillUsers) {
            MkillUserView userView = new MkillUserView();
            BeanUtils.copyProperties(mkillUser, userView);
            userViews.add(userView);
        }
        return userViews;
    }

    @Override
    public MkillUserView getUserById(int id) {
        return null;
    }

    @Override
    public boolean addUser(MkillUserView mkillUserView) {

        MkillUser user = new MkillUser();
        BeanUtils.copyProperties(mkillUserView,user);
        int insert = userMapper.insert(user);

        return insert>0;
    }

    @Override
    public boolean getLoginUser(String userName, String password) {
        return true;
    }

    @Override
    public MkillUser getAdminByUsername(String username) {
        return null;
    }

    @Override
    public MkillUser register(LoginParam loginParam) {
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
    public MkillUser getItem(Long id) {
        return null;
    }

    @Override
    public List<MkillUser> list(String name, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int update(Long id, MkillUser user) {
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
    public List<Role> getRoleList(Long adminId) {
        return null;
    }

    @Override
    public int updatePermission(Long adminId, List<Long> permissionIds) {
        return 0;
    }

    @Override
    public List<Permission> getPermissionList(Long adminId) {
        return null;
    }

    @Override
    public int updatePassword(UpdateUserPasswordParam updatePasswordParam) {
        return 0;
    }

}
