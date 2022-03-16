package com.greentrade.common.domain.sys;

public class GenOtp {
    private String CustNo;
    private String Email;
    private int Type;

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
