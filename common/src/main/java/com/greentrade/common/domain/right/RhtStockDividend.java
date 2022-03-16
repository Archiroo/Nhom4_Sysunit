package com.greentrade.common.domain.right;

import java.util.Date;

public class RhtStockDividend {
    private Integer id;
    private Integer subAccoCd;
    private Date parentDate;
    private Integer parentNo;
    private String secCd;
    private Date entryDate;
    private Double secOwnerQty;
    private Double secOwnerNormalQty;
    private Double secOwnerLimitQty;
    private Double secRecvQty;
    private Double secRecvNormalQty;
    private Double secRecvLimitQty;
    private Date paymentDate;
    private Date paymentTradeDate;
    private Integer paymentStatus;
    private Integer status;
    private String remarks;
    private String approvedUserId;
    private Date approvedTime;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private String subAccoNo;
    private Date ownerFixDate; // ngay chot
    private Date rightExecDate; // ngay thanh toan

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

    public Double getSecOwnerQty() {
        return secOwnerQty;
    }

    public void setSecOwnerQty(Double secOwnerQty) {
        this.secOwnerQty = secOwnerQty;
    }

    public Double getSecOwnerNormalQty() {
        return secOwnerNormalQty;
    }

    public void setSecOwnerNormalQty(Double secOwnerNormalQty) {
        this.secOwnerNormalQty = secOwnerNormalQty;
    }

    public Double getSecOwnerLimitQty() {
        return secOwnerLimitQty;
    }

    public void setSecOwnerLimitQty(Double secOwnerLimitQty) {
        this.secOwnerLimitQty = secOwnerLimitQty;
    }

    public Double getSecRecvQty() {
        return secRecvQty;
    }

    public void setSecRecvQty(Double secRecvQty) {
        this.secRecvQty = secRecvQty;
    }

    public Double getSecRecvNormalQty() {
        return secRecvNormalQty;
    }

    public void setSecRecvNormalQty(Double secRecvNormalQty) {
        this.secRecvNormalQty = secRecvNormalQty;
    }

    public Double getSecRecvLimitQty() {
        return secRecvLimitQty;
    }

    public void setSecRecvLimitQty(Double secRecvLimitQty) {
        this.secRecvLimitQty = secRecvLimitQty;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentTradeDate() {
        return paymentTradeDate;
    }

    public void setPaymentTradeDate(Date paymentTradeDate) {
        this.paymentTradeDate = paymentTradeDate;
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
