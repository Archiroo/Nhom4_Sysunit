package com.greentrade.common.domain.customer;

public class CustLoginInfo {
    private String UserId;
    private String IpLogin;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getIpLogin() {
        return IpLogin;
    }

    public void setIpLogin(String ipLogin) {
        IpLogin = ipLogin;
    }
}
