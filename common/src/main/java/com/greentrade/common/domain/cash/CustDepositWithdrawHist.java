package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustDepositWithdrawHist {
    private Date AlloDate;
    private int RefNo;
    private String OrderCode;
    private int Method;
    private Double Amount;
    private int Status;
    private Date ApprovedTime;
    private Date UpdatedTime;
    private Date CreatedTime;

    private String ToCustNo;
    private int Channel;
    private String Description;

    private int FeeType;
    private Double FeeAmt;

    public Date getAlloDate() {
        return AlloDate;
    }

    public void setAlloDate(Date alloDate) {
        AlloDate = alloDate;
    }

    public int getRefNo() {
        return RefNo;
    }

    public void setRefNo(int refNo) {
        RefNo = refNo;
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

    public int getFeeType() {
        return FeeType;
    }

    public void setFeeType(int feeType) {
        FeeType = feeType;
    }

    public Double getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        FeeAmt = feeAmt;
    }

    public String getToCustNo() {
        return ToCustNo;
    }

    public void setToCustNo(String toCustNo) {
        ToCustNo = toCustNo;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
