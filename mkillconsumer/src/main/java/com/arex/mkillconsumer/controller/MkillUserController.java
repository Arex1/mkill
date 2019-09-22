package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.UserService;
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
public class MkillUserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/user")
    public CommonReturnResults getAllUsers() {
        List<MkillUserView> user = userService.getUser();
        CommonReturnResults results = CommonReturnResults.create(user);
        return results;
    }
}
