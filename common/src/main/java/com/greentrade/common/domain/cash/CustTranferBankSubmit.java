package com.greentrade.common.domain.cash;

public class CustTranferBankSubmit {
    private String BankSName;
    private String BankBranchName;
    private String BankAccoNo;
    private String BankAccoName;
    private Double Amount;
    private String PinCode;

    public String getBankSName() {
        return BankSName;
    }

    public void setBankSName(String bankSName) {
        BankSName = bankSName;
    }

    public String getBankBranchName() {
        return BankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        BankBranchName = bankBranchName;
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

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }
}
