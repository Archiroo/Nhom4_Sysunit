package com.greentrade.common.domain.customer;

import java.util.Date;

public class CustBankAcco {
    private int Id;
    private String BankCode;
    private String BankSName;
    private String BankBranchName;
    private String BankAccoNo;
    private String BankAccoName;
    private Date UpdatedTime;

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

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
