package com.arex.mkillapi.common.error;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.common.error
 * 2019/9/22
 */
public interface CommonError {

    public int getErrorCode();
    public String getErrorMassage();
    public CommonError setErrorMassage(String errorMassage);

}
