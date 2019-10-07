package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.ModelAndView.MkillUserView;
import com.arex.mkillapi.UserService;
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
import javax.servlet.http.HttpSession;

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
        logger.info("进入登录界面。。。。");
        return "login";
    }

    /**
     * @param httpServletRequest
     * @return
     */
    @PostMapping("/in")
    public String getIn(HttpServletRequest httpServletRequest) {

        HttpSession session = httpServletRequest.getSession(true);
        session.setAttribute("6666", 6666);

        return "admin";
    }

    @ResponseBody
    @PostMapping("/checkLogin")
    public CommonReturnResults checkLogin(@RequestParam String username,
                                          @RequestParam String password,
                                          HttpServletRequest request,
                                          HttpServletResponse response)
            throws BusinessException {
        MkillUserView user = userService.getLoginUser(username, password);
        if (user == null) {
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        } else {
            request.getSession().setAttribute("userinfo", user);
            return CommonReturnResults.create("成功");
        }
    }

}
