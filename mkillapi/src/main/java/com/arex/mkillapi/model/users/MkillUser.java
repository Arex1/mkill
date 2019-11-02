package com.arex.mkillapi.model.users;

import com.arex.mkillapi.model.BaseModel;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.model
 * 2019/9/21
 */
@Data
public class MkillUser extends BaseModel {

    private static final long serialVersionUID = 3488541519303777142L;

    /**
     * 用户Id
     */
    private Long id;

    /**
     * 头像
     */
    private String icon;

    /**
     * 用户名字
     */
    private String name;

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
     * "帐号启用状态：0->禁用；1->启用"
     */
    private Integer status;
}
