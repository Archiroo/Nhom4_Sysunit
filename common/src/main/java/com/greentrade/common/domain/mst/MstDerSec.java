package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstDerSec implements Serializable {
    private String secCd;
    private String underlying;
    private int futureType;
    private Date listedDate;
    private Date endTradeDate;
    private Date endPayDate;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    public int getFutureType() {
        return futureType;
    }

    public void setFutureType(int futureType) {
        this.futureType = futureType;
    }

    public Date getListedDate() {
        return listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    public Date getEndTradeDate() {
        return endTradeDate;
    }

    public void setEndTradeDate(Date endTradeDate) {
        this.endTradeDate = endTradeDate;
    }

    public Date getEndPayDate() {
        return endPayDate;
    }

    public void setEndPayDate(Date endPayDate) {
        this.endPayDate = endPayDate;
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
}