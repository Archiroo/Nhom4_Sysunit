package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstMarketState implements Serializable {
    private String MarketCd;
    private String MarketStatus;
    private Integer TradingStatus;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    public String getMarketCd() {
        return MarketCd;
    }

    public void setMarketCd(String marketCd) {
        MarketCd = marketCd;
    }

    public String getMarketStatus() {
        return MarketStatus;
    }

    public void setMarketStatus(String marketStatus) {
        MarketStatus = marketStatus;
    }

    public Integer getTradingStatus() {
        return TradingStatus;
    }

    public void setTradingStatus(Integer tradingStatus) {
        TradingStatus = tradingStatus;
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