package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstMarket implements Serializable {
    private String marketCd;
    private String marketSName;
    private String marketName;
    private String Remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public String getMarketCd() {
        return marketCd;
    }

    public void setMarketCd(String marketCd) {
        this.marketCd = marketCd;
    }

    public String getMarketSName() {
        return marketSName;
    }

    public void setMarketSName(String marketSName) {
        this.marketSName = marketSName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
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