package com.greentrade.common.domain.sys;

import java.util.Date;

public class InitTime {
    private Date BusinessDate;
    private Date ServerDateTime;

    public Date getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(Date businessDate) {
        BusinessDate = businessDate;
    }

    public Date getServerDateTime() {
        return ServerDateTime;
    }

    public void setServerDateTime(Date serverDateTime) {
        ServerDateTime = serverDateTime;
    }
}
