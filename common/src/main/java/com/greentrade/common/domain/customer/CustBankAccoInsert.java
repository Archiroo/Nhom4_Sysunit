package com.greentrade.common.domain.customer;

public class CustBankAccoInsert {
    private String BankCode;
    private String BankBranchCode;
    private String BankAccoNo;
    private String BankAccoName;
    private String Otp;

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    public String getBankBranchCode() {
        return BankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        BankBranchCode = bankBranchCode;
    }

    public String getBankAccoNo() {
        return BankAccoNo;
    }

    public void setBankAccoNo(String bankAccoNo) {
        BankAccoNo = bankAccoNo;
    }

    public String getBankAccoName() {
        return BankAccoName;
    }

    public void setBankAccoName(String bankAccoName) {
        BankAccoName = bankAccoName;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }
}
