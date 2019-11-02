package com.arex.mkillapi.model.users;

import com.arex.mkillapi.model.BaseModel;
import lombok.Data;

import java.io.Serializable;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.model
 * 2019/10/3
 */
@Data
public class Password extends BaseModel {

    private static final long serialVersionUID = 3794497740051994348L;
    private int id;

    private String password;

    private int userId;
}
