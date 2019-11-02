package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.service.UserService;
import com.arex.mkillapi.error.BusinessException;
import com.arex.mkillapi.error.EnumBusinessError;
import com.arex.mkillapi.returnresult.CommonReturnResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/10/7
 */
@Controller
public class LoginController extends BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Reference(version = "1.0.0")
    private UserService userService;

    /**
     * 进入登录界面
     *
     * @return
     */
    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    /**
     * 进入主界面
     *
     * @return
     */
    @GetMapping("/admin")
    public String goAdmin() {
        return "admin";
    }

    /**
     * 对登录用户进行校验
     *
     * @param username
     * @param password
     * @param request
     * @param response
     * @return
     * @throws BusinessException
     */
    @ResponseBody
    @PostMapping("/checkLogin")
    public CommonReturnResults checkLogin(@RequestParam String username,
                                          @RequestParam String password,
                                          HttpServletRequest request,
                                          HttpServletResponse response)
            throws BusinessException {
        boolean loginUser = userService.getLoginUser(username, password);
        //这里进行简单校验，并没有进行其他判断
        if (loginUser) {
            logger.info("error-----方法CommonReturnResults---user");
            request.getSession().setAttribute("userinfo", username);
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        } else {
            request.getSession().setAttribute("userinfo", username);
            return CommonReturnResults.create("成功");
        }
    }

    /**
     * 登出
     *
     * @param request
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("userinfo");
        return "redirect:/login";
    }

}
