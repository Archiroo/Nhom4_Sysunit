package com.greentrade.common.domain.order;

import java.util.Date;

public class CustOrderCancel {
    private String SubAccoNo;
    private int Id;
    private Date UpdatedTime;

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
