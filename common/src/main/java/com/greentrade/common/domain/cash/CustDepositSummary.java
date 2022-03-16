package com.greentrade.common.domain.cash;

import java.math.BigDecimal;
import java.util.Date;

public class CustDepositSummary {
    private Date TradeDate;
    private BigDecimal Amt;

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public BigDecimal getAmt() {
        return Amt;
    }

    public void setAmt(BigDecimal amt) {
        Amt = amt;
    }
}
