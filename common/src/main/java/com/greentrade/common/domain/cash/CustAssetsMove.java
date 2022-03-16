package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustAssetsMove {
    private Date BusinessDate;
    private Double TotalAssets;

    public Date getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(Date businessDate) {
        BusinessDate = businessDate;
    }

    public Double getTotalAssets() {
        return TotalAssets;
    }

    public void setTotalAssets(Double totalAssets) {
        TotalAssets = totalAssets;
    }
}
