package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustTranferBankCancel {
    private Date AlloDate;
    private int RefNo;
    private Date UpdatedTime;

    public Date getAlloDate() {
        return AlloDate;
    }

    public void setAlloDate(Date alloDate) {
        AlloDate = alloDate;
    }

    public int getRefNo() {
        return RefNo;
    }

    public void setRefNo(int refNo) {
        RefNo = refNo;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
