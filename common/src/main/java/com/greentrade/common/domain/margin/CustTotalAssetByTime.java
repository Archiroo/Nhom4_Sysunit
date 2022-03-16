package com.greentrade.common.domain.margin;

import java.math.BigDecimal;
import java.util.Date;

public class CustTotalAssetByTime {
    private Date TradeDate;
    private BigDecimal TotalAssetValue;

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public BigDecimal getTotalAssetValue() {
        return TotalAssetValue;
    }

    public void setTotalAssetValue(BigDecimal totalAssetValue) {
        TotalAssetValue = totalAssetValue;
    }
}
