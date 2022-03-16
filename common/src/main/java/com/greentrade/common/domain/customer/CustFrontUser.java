package com.greentrade.common.domain.customer;

public class CustFrontUser {
    private String UserName;
    private String MobileNo;
    private String Email;
    private boolean IsConfirmEmail;
    private int AuthenType;
    private int Status;
    private boolean Active;
    private boolean ActiveTrading;
    private boolean NeedChangePass;
    private boolean NeedChangePin;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isConfirmEmail() {
        return IsConfirmEmail;
    }

    public void setConfirmEmail(boolean confirmEmail) {
        IsConfirmEmail = confirmEmail;
    }

    public int getAuthenType() {
        return AuthenType;
    }

    public void setAuthenType(int authenType) {
        AuthenType = authenType;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public boolean isActiveTrading() {
        return ActiveTrading;
    }

    public void setActiveTrading(boolean activeTrading) {
        ActiveTrading = activeTrading;
    }

    public boolean isNeedChangePass() {
        return NeedChangePass;
    }

    public void setNeedChangePass(boolean needChangePass) {
        NeedChangePass = needChangePass;
    }

    public boolean isNeedChangePin() {
        return NeedChangePin;
    }

    public void setNeedChangePin(boolean needChangePin) {
        NeedChangePin = needChangePin;
    }
}
