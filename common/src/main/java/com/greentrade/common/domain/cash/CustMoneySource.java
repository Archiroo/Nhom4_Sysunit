package com.greentrade.common.domain.cash;

public class CustMoneySource {
    private String BankCode;
    private String BankSName;
    private String BankBranchName;
    private String BankAccoNo;
    private String BankAccoName;
    private String Remarks;

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

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

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }
}
