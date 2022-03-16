package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdRemoteOrder {
    private Date tradeDate;
    private int id;
    private String fromCompanyCd;
    private String fromCustNo;
    private String orderNo;
    private int tradeType;
    private String secCd;
    private Double orderQty;
    private String orderType;
    private Double orderPrice;
    private Double matQty;
    private Double matPrice;
    private int status;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private String companySName;
    private Date startDate;
    private Date endDate;

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromCompanyCd() {
        return fromCompanyCd;
    }

    public void setFromCompanyCd(String fromCompanyCd) {
        this.fromCompanyCd = fromCompanyCd;
    }

    public String getFromCustNo() {
        return fromCustNo;
    }

    public void setFromCustNo(String fromCustNo) {
        this.fromCustNo = fromCustNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getTradeType() {
        return tradeType;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Double orderQty) {
        this.orderQty = orderQty;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public String getCompanySName() {
        return companySName;
    }

    public void setCompanySName(String companySName) {
        this.companySName = companySName;
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
