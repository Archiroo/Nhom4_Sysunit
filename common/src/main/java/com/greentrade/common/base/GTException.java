package com.greentrade.common.base;

import com.greentrade.common.utils.CompareUtil;
import com.greentrade.common.utils.ExceptionType;
import com.greentrade.common.utils.FileUtil;

import java.sql.SQLException;
import java.util.List;

public class GTException extends SQLException {

    public GTException(){

    }

    public GTException(String lang, String errorCode) {
        this.lang = lang;
        this.errorCode = errorCode;
        setErrorMessage();
    }

    public GTException(String lang, String errorCode, String errorField, String... params) {
        this.lang = lang;
        this.errorCode = errorCode;
        this.errorField = errorField;
        setErrorMessage(params);
    }

    private void setErrorMessage(String... params){
        String errorMsg = FileUtil.getErrorMsgFromResource(errorCode, lang);

        if (params != null && params.length > 0) {
            errorMsg = String.format(errorMsg, params);
        }

        if (CompareUtil.isEqualsNull(errorMsg)) {
//            errorMsg = "Chưa được khai báo lỗi cụ thể trong file ngôn ngữ";
            errorMsg = errorCode;
        }
        this.errorMsg = errorMsg;
    }

    private String errorCode;

    private String errorMsg;

    private String lang;

    private String errorField;


    public String getGTErrorCode() {
        return errorCode;
    }

    public void setGTErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getErrorField() {
        return errorField;
    }

    public void setErrorField(String errorField) {
        this.errorField = errorField;
    }
}
