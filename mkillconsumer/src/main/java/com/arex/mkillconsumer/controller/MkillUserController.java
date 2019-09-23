package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.UserService;
import com.arex.mkillapi.error.BusinessException;
import com.arex.mkillapi.error.EnumBusinessError;
import com.arex.mkillapi.returnresult.CommonReturnResults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/9/23
 */
@Controller
public class MkillUserController extends BaseController{

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/user")
    public CommonReturnResults getAllUsers() throws BusinessException {
        List<MkillUserView> user = userService.getUser();
        if (user == null) {
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        }
        CommonReturnResults results = CommonReturnResults.create(user);
        return results;
    }
}
