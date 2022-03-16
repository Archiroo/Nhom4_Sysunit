package com.greentrade.common.domain.cash;

import java.util.Date;

public class CorMoneySourceBalance {
    private Date BalanceDate;
    private int MoneySourceId;
    private Double BalanceAmt;
    private Double BeginAmt;
    private Double DebitAmt;
    private Double CreditAmt;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    private Date FromDate;
    private Date ToDate;

    public Date getBalanceDate() {
        return BalanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        BalanceDate = balanceDate;
    }

    public int getMoneySourceId() {
        return MoneySourceId;
    }

    public void setMoneySourceId(int moneySourceId) {
        MoneySourceId = moneySourceId;
    }

    public Double getBalanceAmt() {
        return BalanceAmt;
    }

    public void setBalanceAmt(Double balanceAmt) {
        BalanceAmt = balanceAmt;
    }

    public Double getBeginAmt() {
        return BeginAmt;
    }

    public void setBeginAmt(Double beginAmt) {
        BeginAmt = beginAmt;
    }

    public Double getDebitAmt() {
        return DebitAmt;
    }

    public void setDebitAmt(Double debitAmt) {
        DebitAmt = debitAmt;
    }

    public Double getCreditAmt() {
        return CreditAmt;
    }

    public void setCreditAmt(Double creditAmt) {
        CreditAmt = creditAmt;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getCreatedUserId() {
        return CreatedUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        CreatedUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public String getUpdatedUserId() {
        return UpdatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        UpdatedUserId = updatedUserId;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
    }
}
