package com.arex.mkillapi.error;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.error
 * 2019/9/22
 */
public interface CommonError {

    public int getErrorCode();
    public String getErrorMassage();
    public CommonError setErrorMassage(String errorMassage);

}
