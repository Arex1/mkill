package com.arex.mkillapi.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.model
 * 2019/9/21
 */
@Data
public class MkillUser implements Serializable {

    private static final long serialVersionUID = 3488541519303777142L;

    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String telphone;

    private String registerMode;

    private Integer thirdPatryId;

    private Date createdAt;

    private Date updatedAt;
}
