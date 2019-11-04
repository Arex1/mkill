package com.arex.mkillconsumer.controller;

import com.arex.mkillapi.common.error.BusinessException;
import com.arex.mkillapi.common.error.EnumBusinessError;
import com.arex.mkillapi.common.returnresult.CommonReturnResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillconsumer.controller
 * 2019/9/23
 */
public class BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    /**
     * 处理未被Controller吸收的Exception
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(Exception e, HttpServletRequest request) {

        logger.info("找到一个异常BaseController-handlerException");
        Map<String, Object> responseData = new HashMap<>(10);
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            responseData.put("errorCode",businessException.getErrorCode());
            responseData.put("errorMassage",businessException.getErrorMassage());
        } else {
            responseData.put("errorCode", EnumBusinessError.UNKNOW_ERROR.getErrorCode());
            responseData.put("errorMassage",EnumBusinessError.UNKNOW_ERROR.getErrorMassage());
        }
        return CommonReturnResults.create(responseData,"fail");
    }
}
