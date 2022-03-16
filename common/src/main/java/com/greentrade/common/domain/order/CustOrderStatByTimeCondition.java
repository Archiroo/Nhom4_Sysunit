package com.greentrade.common.domain.order;

import java.util.Date;

public class CustOrderStatByTimeCondition {
    private String SubAccoNo;
    private Date FromDate;
    private Date ToDate;

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
    }
}
