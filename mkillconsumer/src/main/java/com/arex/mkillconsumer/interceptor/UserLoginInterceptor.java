package com.arex.mkillconsumer.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.interceptor
 * 2019/10/3
 */
@Component
public class UserLoginInterceptor implements HandlerInterceptor {
    protected static final Logger logger = LoggerFactory.getLogger(UserLoginInterceptor.class);

    /**
     * 在请求处理之前调用,只有返回true才会执行请求
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        //得到session
        HttpSession session = httpServletRequest.getSession(true);

        //得到对象
        Object admin = session.getAttribute("6666");

        //判断对象是否存在
        if (StringUtils.isEmpty(admin)) {
            //不存在则跳转到登录页
            logger.info("进入登录页面");
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 试图渲染之后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    /**
     * 在请求处理之后,视图渲染之前执行
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}

