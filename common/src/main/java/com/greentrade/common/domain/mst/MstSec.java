package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstSec implements Serializable {
    private String secCd;
    private int secType;
    private String secSName;
    private String secName;
    private Integer secClass;
    private Double capitalValue;
    private Double listedQty;
    private Double foreignMaxQty;
    private String marketCd;
    private int tradingLot;
    private int status;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Double parValue;
    private Double maxRoom;

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public int getSecType() {
        return secType;
    }

    public void setSecType(int secType) {
        this.secType = secType;
    }

    public String getSecSName() {
        return secSName;
    }

    public void setSecSName(String secSName) {
        this.secSName = secSName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public Integer getSecClass() {
        return secClass;
    }

    public void setSecClass(Integer secClass) {
        this.secClass = secClass;
    }

    public Double getCapitalValue() {
        return capitalValue;
    }

    public void setCapitalValue(Double capitalValue) {
        this.capitalValue = capitalValue;
    }

    public Double getListedQty() {
        return listedQty;
    }

    public void setListedQty(Double listedQty) {
        this.listedQty = listedQty;
    }

    public Double getForeignMaxQty() {
        return foreignMaxQty;
    }

    public void setForeignMaxQty(Double foreignMaxQty) {
        this.foreignMaxQty = foreignMaxQty;
    }

    public String getMarketCd() {
        return marketCd;
    }

    public void setMarketCd(String marketCd) {
        this.marketCd = marketCd;
    }

    public int getTradingLot() {
        return tradingLot;
    }

    public void setTradingLot(int tradingLot) {
        this.tradingLot = tradingLot;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Double getParValue() {
        return parValue;
    }

    public void setParValue(Double parValue) {
        this.parValue = parValue;
    }

    public Double getMaxRoom() {
        return maxRoom;
    }

    public void setMaxRoom(Double maxRoom) {
        this.maxRoom = maxRoom;
    }
}