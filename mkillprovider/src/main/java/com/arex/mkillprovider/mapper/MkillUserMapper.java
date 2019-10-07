package com.arex.mkillprovider.mapper;

import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.model.MkillUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillprovider.mapper
 * 2019/9/21
 */
public interface MkillUserMapper extends Mapper<MkillUser> {
    /**
     * 根据id获取对应用户的信息
     *
     * @param id
     * @return
     */
    MkillUserView getUserById(@Param("id") int id);

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    boolean getUserByNameWord(String userName, String password);

}
