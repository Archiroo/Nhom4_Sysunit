package com.greentrade.common.domain.sec;

import java.util.Date;

public class CorSecBalance {
    private Date balanceDate;
    private Integer subAccoCd;
    private String secCd;
    private Integer secType;
    private Double balanceQty;
    private Double beginQty;
    private Double debitQty;
    private Double creditQty;
    private Double pendingDebitQty;
    private String unitCode;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Date startDate;
    private Date endDate;
    private String custNo;
    private String subAccoNo;

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

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Double getBeginQty() {
        return beginQty;
    }

    public void setBeginQty(Double beginQty) {
        this.beginQty = beginQty;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Integer getSecType() {
        return secType;
    }

    public void setSecType(Integer secType) {
        this.secType = secType;
    }

    public Double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(Double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public Double getDebitQty() {
        return debitQty;
    }

    public void setDebitQty(Double debitQty) {
        this.debitQty = debitQty;
    }

    public Double getCreditQty() {
        return creditQty;
    }

    public void setCreditQty(Double creditQty) {
        this.creditQty = creditQty;
    }

    public Double getPendingDebitQty() {
        return pendingDebitQty;
    }

    public void setPendingDebitQty(Double pendingDebitQty) {
        this.pendingDebitQty = pendingDebitQty;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
