package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.UserService;
import com.arex.mkillapi.error.BusinessException;
import com.arex.mkillapi.error.EnumBusinessError;
import com.arex.mkillapi.returnresult.CommonReturnResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/9/23
 */
@Controller
public class MkillUserController extends BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(MkillUserController.class);

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public CommonReturnResults getAllUsers() throws BusinessException {
        List<MkillUserView> user = userService.getUser();
        if (CollectionUtils.isEmpty(user)) {
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnResults.create(user);
    }

    @GetMapping("/admin")
    public String getWeb(ModelMap model){
        List<MkillUserView> user = userService.getUser();
        CommonReturnResults commonReturnResults = CommonReturnResults.create(user);
        model.addAttribute("users",commonReturnResults);
        return "admin";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/in")
    public String getIn(HttpServletRequest httpServletRequest){

        HttpSession session = httpServletRequest.getSession(true);
        session.setAttribute("6666",6666);

        return "admin";
    }
}
