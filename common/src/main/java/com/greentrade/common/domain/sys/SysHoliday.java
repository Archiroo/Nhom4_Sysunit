package com.greentrade.common.domain.sys;

import java.io.Serializable;
import java.util.Date;

public class SysHoliday implements Serializable {
    private Date holiday;

    private Integer type;

    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;
    private Integer year;

    public Date getHoliday() {
        return holiday;
    }

    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
