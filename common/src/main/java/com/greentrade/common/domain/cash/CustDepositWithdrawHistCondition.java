package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustDepositWithdrawHistCondition {
    private Date FromDate;
    private Date ToDate;
    private int Status;

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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
