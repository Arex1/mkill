package com.arex.mkill.dao;

import com.arex.mkill.domain.Password;

public interface PasswordMapper {
    int insert(Password record);

    int insertSelective(Password record);

    Password selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Password record);

    int updateByPrimaryKey(Password record);
}