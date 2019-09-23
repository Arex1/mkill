package com.arex.mkillconsumer.controller;

import com.arex.mkillapi.error.BusinessException;
import com.arex.mkillapi.error.EnumBusinessError;
import com.arex.mkillapi.returnresult.CommonReturnResults;
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
