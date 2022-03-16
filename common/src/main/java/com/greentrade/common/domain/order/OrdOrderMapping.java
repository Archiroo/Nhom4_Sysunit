package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdOrderMapping {
    private Date TradeDate;
    private int Id;
    private int OrderId;
    private int RemoteOrderId;
    private String FromCompanyCd;
    private String FromCustNo;
    private String OrderNo;
    private Double OrderQty;
    private String OrderType;
    private Double OrderPrice;
    private int Status;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
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

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getRemoteOrderId() {
        return RemoteOrderId;
    }

    public void setRemoteOrderId(int remoteOrderId) {
        RemoteOrderId = remoteOrderId;
    }

    public String getFromCompanyCd() {
        return FromCompanyCd;
    }

    public void setFromCompanyCd(String fromCompanyCd) {
        FromCompanyCd = fromCompanyCd;
    }

    public String getFromCustNo() {
        return FromCustNo;
    }

    public void setFromCustNo(String fromCustNo) {
        FromCustNo = fromCustNo;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public Double getOrderQty() {
        return OrderQty;
    }

    public void setOrderQty(Double orderQty) {
        OrderQty = orderQty;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public Double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        OrderPrice = orderPrice;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
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
}
