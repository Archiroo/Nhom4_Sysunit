package com.greentrade.common.domain.cash;

public class CustTranferLocalSubmit {
    private String ToCustNo;
    private Double Amount;
    private String Description;
    private String Otp;

    public String getToCustNo() {
        return ToCustNo;
    }

    public void setToCustNo(String toCustNo) {
        ToCustNo = toCustNo;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }
}
