package com.greentrade.common.domain.order;

import java.util.Date;

public class CustOrder {
    private Date TradeDate;
    private int Id;
    private String SecCd;
    private Date CreatedTime;
    private int TradeType;
    private String OrderType;
    private Double OrderQty;
    private Double OrderPrice;
    private Double MatQty;
    private Double MatPrice;
    private Double CurrentPrice;
    private int OrderStatusNew;
    private Date UpdatedTime;

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public Double getOrderQty() {
        return OrderQty;
    }

    public void setOrderQty(Double orderQty) {
        OrderQty = orderQty;
    }

    public Double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        OrderPrice = orderPrice;
    }

    public Double getMatQty() {
        return MatQty;
    }

    public void setMatQty(Double matQty) {
        MatQty = matQty;
    }

    public Double getMatPrice() {
        return MatPrice;
    }

    public void setMatPrice(Double matPrice) {
        MatPrice = matPrice;
    }

    public int getOrderStatusNew() {
        return OrderStatusNew;
    }

    public void setOrderStatusNew(int orderStatusNew) {
        OrderStatusNew = orderStatusNew;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public Double getCurrentPrice() {
        return CurrentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        CurrentPrice = currentPrice;
    }
}
