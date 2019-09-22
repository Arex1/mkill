package com.arex.mkillapi;


import com.arex.mkillapi.ModelAndView.MkillUserView;

import java.util.List;


/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi
 * 2019/9/21
 */
public interface UserService {

    List<MkillUserView> getUser();
}
