package com.greentrade.common.domain.sys;

import java.util.Date;

public class SysLink {
    private Date BusinessDate;
    private int Id;
    private int Type;
    private int CustCd;
    private int SendToType;
    private String SendTo;
    private String LinkUuid;
    private Date ExpiredTime;
    private int Status;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    public Date getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(Date businessDate) {
        BusinessDate = businessDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getCustCd() {
        return CustCd;
    }

    public void setCustCd(int custCd) {
        CustCd = custCd;
    }

    public int getSendToType() {
        return SendToType;
    }

    public void setSendToType(int sendToType) {
        SendToType = sendToType;
    }

    public String getSendTo() {
        return SendTo;
    }

    public void setSendTo(String sendTo) {
        SendTo = sendTo;
    }

    public String getLinkUuid() {
        return LinkUuid;
    }

    public void setLinkUuid(String linkUuid) {
        LinkUuid = linkUuid;
    }

    public Date getExpiredTime() {
        return ExpiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        ExpiredTime = expiredTime;
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
