package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdRemoteResult implements Comparable<OrdRemoteResult>{
    private Date tradeDate;
    private int id;
    private int remoteOrderId;
    private Double matQty;
    private Double matPrice;
    private int status;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private int tradeType;
    private String secCd;

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

    public int getRemoteOrderId() {
        return remoteOrderId;
    }

    public void setRemoteOrderId(int remoteOrderId) {
        this.remoteOrderId = remoteOrderId;
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

    @Override
    public int compareTo(OrdRemoteResult e) {
        return this.getUpdatedTime().compareTo(e.getUpdatedTime());
    }
}
