package com.arex.mkillconsumer.adapter;

import com.arex.mkillconsumer.interceptor.UserLoginInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.Resource;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.adapter
 * 2019/10/3
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class UserLoginConfigurer implements WebMvcConfigurer {

    @Resource
    private UserLoginInterceptor interceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/**")
                .excludePathPatterns("/**", "/login")
                .excludePathPatterns("/static/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/resources/**", "/static/**")
                .addResourceLocations("classpath:/resources/", "classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

}
