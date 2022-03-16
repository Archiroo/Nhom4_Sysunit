package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustTranferBankHist {
    private Date AlloDate;
    private int RefNo;
    private String OrderCode;
    private int Method;
    private Double Amount;
    private int Status;
    private Date ApprovedTime;
    private Date UpdatedTime;
    private Date CreatedTime;

    public Date getAlloDate() {
        return AlloDate;
    }

    public void setAlloDate(Date alloDate) {
        AlloDate = alloDate;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }

    public int getMethod() {
        return Method;
    }

    public void setMethod(int method) {
        Method = method;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Date getApprovedTime() {
        return ApprovedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        ApprovedTime = approvedTime;
    }

    public int getRefNo() {
        return RefNo;
    }

    public void setRefNo(int refNo) {
        RefNo = refNo;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }
}
