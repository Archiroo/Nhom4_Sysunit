package com.greentrade.common.domain.customer;

public class CustChangeMail {
    private String OldEmail;
    private String NewEmail;
    private String Otp;

    public String getOldEmail() {
        return OldEmail;
    }

    public void setOldEmail(String oldEmail) {
        OldEmail = oldEmail;
    }

    public String getNewEmail() {
        return NewEmail;
    }

    public void setNewEmail(String newEmail) {
        NewEmail = newEmail;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }
}
