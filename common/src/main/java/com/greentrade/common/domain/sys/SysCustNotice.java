package com.greentrade.common.domain.sys;

import java.util.Date;

public class SysCustNotice {
    private int id;
    private Date businessDate;
    private int type;
    private Date refDate;
    private Integer refId;
    private int toType;
    private int toChannel;
    private Integer toCustCd;
    private Integer toCustGroupId;
    private String title;
    private String content;
    private String contentDetail;
    private int status;
    private int retries;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private String toCustNo;
    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public int getToType() {
        return toType;
    }

    public void setToType(int toType) {
        this.toType = toType;
    }

    public int getToChannel() {
        return toChannel;
    }

    public void setToChannel(int toChannel) {
        this.toChannel = toChannel;
    }

    public Integer getToCustCd() {
        return toCustCd;
    }

    public void setToCustCd(Integer toCustCd) {
        this.toCustCd = toCustCd;
    }

    public Integer getToCustGroupId() {
        return toCustGroupId;
    }

    public void setToCustGroupId(Integer toCustGroupId) {
        this.toCustGroupId = toCustGroupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentDetail() {
        return contentDetail;
    }

    public void setContentDetail(String contentDetail) {
        this.contentDetail = contentDetail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
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

    public String getToCustNo() {
        return toCustNo;
    }

    public void setToCustNo(String toCustNo) {
        this.toCustNo = toCustNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
