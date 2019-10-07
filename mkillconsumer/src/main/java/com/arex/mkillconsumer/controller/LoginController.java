package com.arex.mkillconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/10/7
 */
@Controller
@RequestMapping("/")
public class LoginController extends BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);

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
     *
     * @param httpServletRequest
     * @return
     */
    @PostMapping("/in")
    public String getIn(HttpServletRequest httpServletRequest){

        HttpSession session = httpServletRequest.getSession(true);
        session.setAttribute("6666",6666);

        return "admin";
    }
}
