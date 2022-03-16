package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdResult {
    private Date TradeDate;
    private int Id;
    private String FromCompanyCd;
    private String FromCustNo;
    private int TradeType;
    private String SecCd;
    private Double MatQty;
    private Double MatPrice;
    private int Status;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private String CompanySName;
    private String CompanyCd;

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

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
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

    public String getCompanySName() {
        return CompanySName;
    }

    public void setCompanySName(String companySName) {
        CompanySName = companySName;
    }

    public String getCompanyCd() {
        return CompanyCd;
    }

    public void setCompanyCd(String companyCd) {
        CompanyCd = companyCd;
    }
}
