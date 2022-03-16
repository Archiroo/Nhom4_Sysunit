package com.greentrade.common.domain.right;

import java.util.Date;

public class RhtCashDividendDetail {
    private Integer id;
    private Integer subAccoCd;
    private Date parentDate;
    private Integer parentNo;
    private String secCd;
    private Double payRate;
    private Double amount;
    private Double taxAmt;
    private Boolean taxCollected;
    private Double transferFeeAmt;
    private Date paymentDate;
    private Integer status;
    private String remarks;
    private String approvedUserId;
    private Date approvedTime;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public Date getParentDate() {
        return parentDate;
    }

    public void setParentDate(Date parentDate) {
        this.parentDate = parentDate;
    }

    public Integer getParentNo() {
        return parentNo;
    }

    public void setParentNo(Integer parentNo) {
        this.parentNo = parentNo;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Boolean getTaxCollected() {
        return taxCollected;
    }

    public void setTaxCollected(Boolean taxCollected) {
        this.taxCollected = taxCollected;
    }

    public Double getTransferFeeAmt() {
        return transferFeeAmt;
    }

    public void setTransferFeeAmt(Double transferFeeAmt) {
        this.transferFeeAmt = transferFeeAmt;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getApprovedUserId() {
        return approvedUserId;
    }

    public void setApprovedUserId(String approvedUserId) {
        this.approvedUserId = approvedUserId;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
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
