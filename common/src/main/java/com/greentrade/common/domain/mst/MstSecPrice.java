package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstSecPrice implements Serializable {
    private String SecCd;
    private String MarketCd;
    private Integer SecNo;
    private int SecType;
    private Double OpenPrice;
    private Double ClosePrice;
    private Double BasicPrice;
    private Double CeilingPrice;
    private Double FloorPrice;
    private Double AvgPrice;
    private String Suspension;
    private String Delisted;
    private String Halted;
    private String Splited;
    private String Benefit;
    private String Meeting;
    private String Notice;
    private String Blocked;
    private String SessionId;
    private Double TotalRoom;
    private Double CurrentRoom;
    private Double LastPricePre;
    private Double LastPrice;
    private Double TotalQty;
    private Double TotalAmt;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public String getMarketCd() {
        return MarketCd;
    }

    public void setMarketCd(String marketCd) {
        MarketCd = marketCd;
    }

    public Integer getSecNo() {
        return SecNo;
    }

    public void setSecNo(Integer secNo) {
        SecNo = secNo;
    }

    public int getSecType() {
        return SecType;
    }

    public void setSecType(int secType) {
        SecType = secType;
    }

    public Double getOpenPrice() {
        return OpenPrice;
    }

    public void setOpenPrice(Double openPrice) {
        OpenPrice = openPrice;
    }

    public Double getClosePrice() {
        return ClosePrice;
    }

    public void setClosePrice(Double closePrice) {
        ClosePrice = closePrice;
    }

    public Double getBasicPrice() {
        return BasicPrice;
    }

    public void setBasicPrice(Double basicPrice) {
        BasicPrice = basicPrice;
    }

    public Double getCeilingPrice() {
        return CeilingPrice;
    }

    public void setCeilingPrice(Double ceilingPrice) {
        CeilingPrice = ceilingPrice;
    }

    public Double getFloorPrice() {
        return FloorPrice;
    }

    public void setFloorPrice(Double floorPrice) {
        FloorPrice = floorPrice;
    }

    public Double getAvgPrice() {
        return AvgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        AvgPrice = avgPrice;
    }

    public String getSuspension() {
        return Suspension;
    }

    public void setSuspension(String suspension) {
        Suspension = suspension;
    }

    public String getDelisted() {
        return Delisted;
    }

    public void setDelisted(String delisted) {
        Delisted = delisted;
    }

    public String getHalted() {
        return Halted;
    }

    public void setHalted(String halted) {
        Halted = halted;
    }

    public String getSplited() {
        return Splited;
    }

    public void setSplited(String splited) {
        Splited = splited;
    }

    public String getBenefit() {
        return Benefit;
    }

    public void setBenefit(String benefit) {
        Benefit = benefit;
    }

    public String getMeeting() {
        return Meeting;
    }

    public void setMeeting(String meeting) {
        Meeting = meeting;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

    public String getBlocked() {
        return Blocked;
    }

    public void setBlocked(String blocked) {
        Blocked = blocked;
    }

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String sessionId) {
        SessionId = sessionId;
    }

    public Double getTotalRoom() {
        return TotalRoom;
    }

    public void setTotalRoom(Double totalRoom) {
        TotalRoom = totalRoom;
    }

    public Double getCurrentRoom() {
        return CurrentRoom;
    }

    public void setCurrentRoom(Double currentRoom) {
        CurrentRoom = currentRoom;
    }

    public Double getLastPricePre() {
        return LastPricePre;
    }

    public void setLastPricePre(Double lastPricePre) {
        LastPricePre = lastPricePre;
    }

    public Double getLastPrice() {
        return LastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        LastPrice = lastPrice;
    }

    public Double getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(Double totalQty) {
        TotalQty = totalQty;
    }

    public Double getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        TotalAmt = totalAmt;
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