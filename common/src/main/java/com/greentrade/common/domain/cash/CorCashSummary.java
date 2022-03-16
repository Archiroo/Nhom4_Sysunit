package com.greentrade.common.domain.cash;

import java.util.Date;

public class CorCashSummary {
    Date SummaryDate;
    int SubAccoCd;
    String AmountType;
    Double TotalAmt;
    Double BeginAmt;
    Double PendingAmt;
    String UnitCode;
    String Remarks;
    String CreatedUserId;
    Date CreatedTime;
    String UpdatedUserId;
    Date UpdatedTime;

    private String subAccoNo;
    private Double withdraw;
    private Integer actionType;

    private Date startDate;
    private Date endDate;

    public Double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Double withdraw) {
        this.withdraw = withdraw;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Date getSummaryDate() {
        return SummaryDate;
    }

    public void setSummaryDate(Date summaryDate) {
        SummaryDate = summaryDate;
    }

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public String getAmountType() {
        return AmountType;
    }

    public void setAmountType(String amountType) {
        AmountType = amountType;
    }

    public Double getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        TotalAmt = totalAmt;
    }

    public Double getBeginAmt() {
        return BeginAmt;
    }

    public void setBeginAmt(Double beginAmt) {
        BeginAmt = beginAmt;
    }

    public Double getPendingAmt() {
        return PendingAmt;
    }

    public void setPendingAmt(Double pendingAmt) {
        PendingAmt = pendingAmt;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
