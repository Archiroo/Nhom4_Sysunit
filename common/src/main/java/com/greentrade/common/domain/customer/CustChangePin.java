package com.greentrade.common.domain.customer;

public class CustChangePin {
    private String OldPin;
    private String NewPin;
    private String Otp;

    public String getOldPin() {
        return OldPin;
    }

    public void setOldPin(String oldPin) {
        OldPin = oldPin;
    }

    public String getNewPin() {
        return NewPin;
    }

    public void setNewPin(String newPin) {
        NewPin = newPin;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }
}
