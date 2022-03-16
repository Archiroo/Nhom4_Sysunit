package com.greentrade.common.domain.customer;

import java.util.Date;

public class CustSubAccoClose {
    private String SubAccoNo;
    private Date UpdatedTime;

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
