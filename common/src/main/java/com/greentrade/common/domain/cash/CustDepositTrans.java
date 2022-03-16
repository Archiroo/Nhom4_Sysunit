package com.greentrade.common.domain.cash;

import java.math.BigDecimal;
import java.util.Date;

public class CustDepositTrans {
    private Date TradeDate;
    private int TradeType;
    private BigDecimal CreditAmt;
    private BigDecimal DebitAmt;

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public BigDecimal getCreditAmt() {
        return CreditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        CreditAmt = creditAmt;
    }

    public BigDecimal getDebitAmt() {
        return DebitAmt;
    }

    public void setDebitAmt(BigDecimal debitAmt) {
        DebitAmt = debitAmt;
    }
}
