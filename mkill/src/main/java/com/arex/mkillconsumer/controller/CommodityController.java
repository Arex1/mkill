package com.arex.mkillconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/10/16
 */
@Controller
public class CommodityController extends BaseController {
    protected static final Logger logger = LoggerFactory.getLogger(CommodityController.class);

    /**
     * 获取商品信息展示对应页面
     *
     * @return
     */
    @GetMapping("/commodity")
    public String getAllCommodity() {
        logger.info("获取商品信息");
        return "commodity";
    }

}
