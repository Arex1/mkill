package com.arex.mkillapi.returnresult;

import lombok.Data;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.mkillapi.returnresult
 * 2019/9/21
 */
@Data
public class CommonReturnResults {

    private String state;
    private Object Data;

    public static CommonReturnResults create(Object result){
        return CommonReturnResults.create(result,"success");
    }

    public static CommonReturnResults create(Object result, String state) {
        CommonReturnResults results = new CommonReturnResults();
        results.setData(result);
        results.setState(state);
        return results;
    }
}
