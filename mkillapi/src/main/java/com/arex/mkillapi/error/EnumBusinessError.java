package com.arex.mkillapi.error;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.error
 * 2019/9/22
 */
public enum EnumBusinessError implements CommonError {
    //用户不存在
    USER_NOT_EXIST(10000,"用户不存在"),
    //参数不合法
    COMMON_ERROR(10001,"参数不合法"),
    //未知错误
    UNKNOW_ERROR(50000,"未知错误")
    ;

    private int errorCode;
    private String errorMassage;

    private EnumBusinessError(int errorCode,String errorMassage){
        this.errorCode = errorCode;
        this.errorMassage = errorMassage;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMassage() {
        return this.errorMassage;
    }

    @Override
    public CommonError setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
        return this;
    }
}
