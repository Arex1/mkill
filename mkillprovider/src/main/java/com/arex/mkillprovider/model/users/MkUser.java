package com.arex.mkillprovider.model.users;

import com.arex.mkillapi.common.BaseModel;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.model
 * 2019/9/21
 */
@Data
public class MkUser extends BaseModel {

    private static final long serialVersionUID = 3488541519303777142L;

    /**
     * 头像
     */
    private String icon;

    /**
     * 用户账号
     */
    private String name;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
    /**
     * 加密密码的盐
     */
    private String salt;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户手机号
     */
    private String telphone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户第三方id
     */
    private Integer thirdPatryId;

    /**
     * 用户注册
     */
    private String registerMode;

    /**
     * 备注信息
     */
    private String note;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 信息修改时间
     */
    private LocalDateTime updatedAt;

    /**
     * 最后登录时间
     */
    private LocalDateTime loginTime;

    /**
     * 用户状态,
     * 0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 ,
     * 1:正常状态,
     * 2：用户被锁定.
     */
    private byte state;

    /**
     * 一个用户具有多个角色
     */
    @TableField(exist = false)
    private List<MkRole> roleList;

}
