package com.greentrade.common.domain.sys;

import java.util.Date;

public class CustCustNoticeDetail {
    private String Title;
    private String Content;
    private String ContentDetail;
    private Date CreatedTime;

    private Date UpdatedTime;

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

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
