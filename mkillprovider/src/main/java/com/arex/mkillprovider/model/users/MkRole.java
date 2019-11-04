package com.arex.mkillprovider.model.users;

import com.arex.mkillapi.common.BaseModel;
import lombok.Data;

import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.model
 * 2019/11/2
 */
@Data
public class MkRole extends BaseModel {
    private static final long serialVersionUID = 5121252677203123361L;

    /**
     * 角色标识程序中判断使用,如"admin",这个是唯一的:
     */
    private String role;
    /**
     * 角色描述,UI界面显示使用
     */
    private String description;
    /**
     * 是否可用,如果不可用将不会添加给用户
     */
    private Boolean available = Boolean.FALSE;

    /**
     * 角色 -- 权限关系：多对多关系;
     */
    private List<MkPermission> permissions;

    /**
     * 一个角色对应多个用户
     */
    private List<MkUser> user;

}
