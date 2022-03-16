package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdMatch {
    private Date tradeDate;
    private Integer id;
    private Integer orderId;
    private Integer orderResultId;
    private Integer subAccoCd;
    private String subAccoNo;
    private Integer custCd;
    private String custNo;
    private String custName;
    private String custUnitCode;
    private Integer tradeType;
    private String secCd;
    private Integer secType;
    private Double matQty;
    private Double matPrice;
    private Double matAmt;
    private Double feeAmt;
    private Double taxAmt;
    private Double loanAmt;
    private Double interestAmt;
    private Double depositAmt;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Date startDate;
    private Date endDate;

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderResultId() {
        return orderResultId;
    }

    public void setOrderResultId(Integer orderResultId) {
        this.orderResultId = orderResultId;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Integer getCustCd() {
        return custCd;
    }

    public void setCustCd(Integer custCd) {
        this.custCd = custCd;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustUnitCode() {
        return custUnitCode;
    }

    public void setCustUnitCode(String custUnitCode) {
        this.custUnitCode = custUnitCode;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
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

    public Double getMatQty() {
        return matQty;
    }

    public void setMatQty(Double matQty) {
        this.matQty = matQty;
    }

    public Double getMatPrice() {
        return matPrice;
    }

    public void setMatPrice(Double matPrice) {
        this.matPrice = matPrice;
    }

    public Double getMatAmt() {
        return matAmt;
    }

    public void setMatAmt(Double matAmt) {
        this.matAmt = matAmt;
    }

    public Double getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Double getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(Double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Double getInterestAmt() {
        return interestAmt;
    }

    public void setInterestAmt(Double interestAmt) {
        this.interestAmt = interestAmt;
    }

    public Double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        this.depositAmt = depositAmt;
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
