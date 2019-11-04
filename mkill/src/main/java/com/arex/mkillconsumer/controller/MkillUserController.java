package com.arex.mkillconsumer.controller;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.arex.mkillapi.dto.MkUserView;
import com.arex.mkillapi.service.UserService;
import com.arex.mkillapi.common.error.BusinessException;
import com.arex.mkillapi.common.error.EnumBusinessError;
import com.arex.mkillapi.common.returnresult.CommonReturnResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * 获取所有用户列表数据
     *
     * @return
     * @throws BusinessException
     */
    @GetMapping("/user")
    @ResponseBody
    public CommonReturnResults getAllUsers() throws BusinessException {
        logger.info("getAllUsers");
        List<MkUserView> user = userService.getUser();
        if (CollectionUtils.isEmpty(user)) {
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnResults.create(user);
    }

    /**
     * 暂时试用测试
     * @param model
     * @return
     */
    @GetMapping("/users")
    public String getWeb(ModelMap model)  {
        logger.info("getWeb---getAllUsers");
        List<MkUserView> user = userService.getUser();
        CommonReturnResults commonReturnResults = CommonReturnResults.create(user);
        model.addAttribute("users", commonReturnResults);
        return "user_page";
    }

}
