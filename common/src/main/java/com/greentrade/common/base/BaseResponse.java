package com.greentrade.common.base;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    // Default là Lỗi
    public BaseResponse() {
        resultCode = -1;
    }

    // 0.Success
    // Khác 0 => lỗi
    private int resultCode;

    private String errorCode;

    private String errorMsg;

    private String errorField;

    private Object data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorField() {
        return errorField;
    }

    public void setErrorField(String errorField) {
        this.errorField = errorField;
    }
}
