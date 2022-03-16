package com.greentrade.common.domain.sys;

import java.util.Date;

public class CustCustNotice {
    private int Id;
    private Date CreatedTime;
    private String Title;
    private String Content;
    private String ContentDetail;
    private Integer MarkStatus;
    private Date UpdatedTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getContentDetail() {
        return ContentDetail;
    }

    public void setContentDetail(String contentDetail) {
        ContentDetail = contentDetail;
    }

    public Integer getMarkStatus() {
        return MarkStatus;
    }

    public void setMarkStatus(Integer markStatus) {
        MarkStatus = markStatus;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
