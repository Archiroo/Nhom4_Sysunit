package com.greentrade.common.domain.customer;

import java.util.Date;

public class CustSummaryCondition {
    private Date FromDate;
    private Date ToDate;

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
