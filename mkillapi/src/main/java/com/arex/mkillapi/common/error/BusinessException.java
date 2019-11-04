package com.arex.mkillapi.common.error;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.common.error
 * 2019/9/22
 */
//包装器业务异常处理
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError, String errorMassage){
        super();
        this.commonError = commonError;
        this.commonError.setErrorMassage(errorMassage);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMassage() {
        return this.commonError.getErrorMassage();
    }

    @Override
    public CommonError setErrorMassage(String errorMassage) {
        this.commonError.setErrorMassage(errorMassage);
        return this;
    }
}
