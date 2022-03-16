package com.greentrade.common.domain.customer;

public class CustChangePass {
    private String OldPass;
    private String NewPass;
    private boolean IsLogout;
    private String Otp;

    public String getOldPass() {
        return OldPass;
    }

    public void setOldPass(String oldPass) {
        OldPass = oldPass;
    }

    public String getNewPass() {
        return NewPass;
    }

    public void setNewPass(String newPass) {
        NewPass = newPass;
    }

    public boolean getIsLogout() {
        return IsLogout;
    }

    public void setIsLogout(boolean isLogout) {
        IsLogout = isLogout;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }
}
