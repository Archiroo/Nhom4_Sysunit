package com.greentrade.common.domain.cash;

import java.io.Serializable;
import java.util.Date;

public class CorCashMoveSource implements Serializable {

    private Integer Id;
    private Date moveAlloDate;
    private Integer moveRefNo;
    private Integer moneySourceId;
    private Double amount;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;
    private String moneySourceCode;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMoneySourceCode() {
        return moneySourceCode;
    }

    public void setMoneySourceCode(String moneySourceCode) {
        this.moneySourceCode = moneySourceCode;
    }

    public Date getMoveAlloDate() {
        return moveAlloDate;
    }

    public void setMoveAlloDate(Date moveAlloDate) {
        this.moveAlloDate = moveAlloDate;
    }

    public Integer getMoveRefNo() {
        return moveRefNo;
    }

    public void setMoveRefNo(Integer moveRefNo) {
        this.moveRefNo = moveRefNo;
    }

    public Integer getMoneySourceId() {
        return moneySourceId;
    }

    public void setMoneySourceId(Integer moneySourceId) {
        this.moneySourceId = moneySourceId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
