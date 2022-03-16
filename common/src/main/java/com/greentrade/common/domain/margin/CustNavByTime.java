package com.greentrade.common.domain.margin;

import java.math.BigDecimal;
import java.util.Date;

public class CustNavByTime {
    private Date TradeDate;
    private BigDecimal NavValue;

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public BigDecimal getNavValue() {
        return NavValue;
    }

    public void setNavValue(BigDecimal navValue) {
        NavValue = navValue;
    }
}
