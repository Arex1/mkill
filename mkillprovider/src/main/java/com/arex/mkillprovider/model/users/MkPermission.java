package com.arex.mkillapi.model.users;

import com.arex.mkillapi.model.BaseModel;

import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.model
 * 2019/11/2
 */
public class MkPermission extends BaseModel {
    private static final long serialVersionUID = -2164417608785166749L;

    /**
     * 名称
     */
    private String name;
    /**
     * 资源类型，[menu|button]
     */
    private String resourceType;
    /**
     * 资源路径
     */
    private String url;
    /**
     * 权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
     */
    private String permission;
    /**
     * 父编号
     */
    private Long parentId;
    /**
     * 父编号列表
     */
    private String parentIds;
    /**
     * 是否可用,如果不可用将不会添加给用户
     */
    private Boolean available = Boolean.FALSE;
    /**
     * 一个角色多个权限
     */
    private List<MkRole> roles;
}
