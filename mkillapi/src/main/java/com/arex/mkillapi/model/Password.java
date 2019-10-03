package com.arex.mkillapi.model;

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
public class Password implements Serializable {

    private int id;

    private String password;

    private int userId;
}
