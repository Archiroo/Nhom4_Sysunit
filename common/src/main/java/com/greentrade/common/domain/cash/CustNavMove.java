package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustNavMove {
    private Date BusinessDate;
    private Double NAV;

    public Date getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(Date businessDate) {
        BusinessDate = businessDate;
    }

    public Double getNAV() {
        return NAV;
    }

    public void setNAV(Double NAV) {
        this.NAV = NAV;
    }
}
