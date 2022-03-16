package com.greentrade.common.domain.right;

import java.util.Date;

public class RhtCashDividend {
    private Integer id;
    private Integer subAccoCd;
    private Date parentDate;
    private Integer parentNo;
    private String secCd;
    private Date entryDate;
    private Double secOwnerQty;
    private Double amount;
    private Double taxAmt;
    private Boolean taxCollected;
    private Double transferFeeAmt;
    private Integer paymentStatus;
    private Integer status;
    private String remarks;
    private String approvedUserId;
    private Date approvedTime;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Date startDate;
    private Date endDate;
    private String subAccoNo;
    private Date ownerFixDate; // ngay chot
    private Date rightExecDate; // ngay thanh toan
    private Double payedAmount; // tien da thanh toan
    private Double payedRate; // ti le da thanh toan

    private Date dateInput;
    private Double rateInput;

    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }

    public Double getRateInput() {
        return rateInput;
    }

    public void setRateInput(Double rateInput) {
        this.rateInput = rateInput;
    }

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

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Date getOwnerFixDate() {
        return ownerFixDate;
    }

    public void setOwnerFixDate(Date ownerFixDate) {
        this.ownerFixDate = ownerFixDate;
    }

    public Date getRightExecDate() {
        return rightExecDate;
    }

    public void setRightExecDate(Date rightExecDate) {
        this.rightExecDate = rightExecDate;
    }

    public Double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public Double getPayedRate() {
        return payedRate;
    }

    public void setPayedRate(Double payedRate) {
        this.payedRate = payedRate;
    }

    public Double getSecOwnerQty() {
        return secOwnerQty;
    }

    public void setSecOwnerQty(Double secOwnerQty) {
        this.secOwnerQty = secOwnerQty;
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

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
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
