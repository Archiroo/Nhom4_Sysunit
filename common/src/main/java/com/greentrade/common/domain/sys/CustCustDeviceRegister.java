package com.greentrade.common.domain.sys;

public class CustCustDeviceRegister {
    private int Platform;
    private String NotiToken;
    private String DeviceId;
    private String DeviceInfo;

    public int getPlatform() {
        return Platform;
    }

    public void setPlatform(int platform) {
        Platform = platform;
    }

    public String getNotiToken() {
        return NotiToken;
    }

    public void setNotiToken(String notiToken) {
        NotiToken = notiToken;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        DeviceInfo = deviceInfo;
    }
}
