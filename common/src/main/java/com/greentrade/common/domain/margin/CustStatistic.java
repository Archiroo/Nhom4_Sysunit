package com.greentrade.common.domain.margin;

import java.math.BigDecimal;

public class CustStatistic {
    private BigDecimal ProfitAmt;
    private int NumberStockDividend;
    private BigDecimal AmountCashDividend;
    private BigDecimal TotalCreditAmt;
    private BigDecimal TotalDebitAmt;

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }

    public int getNumberStockDividend() {
        return NumberStockDividend;
    }

    public void setNumberStockDividend(int numberStockDividend) {
        NumberStockDividend = numberStockDividend;
    }

    public BigDecimal getAmountCashDividend() {
        return AmountCashDividend;
    }

    public void setAmountCashDividend(BigDecimal amountCashDividend) {
        AmountCashDividend = amountCashDividend;
    }

    public BigDecimal getTotalCreditAmt() {
        return TotalCreditAmt;
    }

    public void setTotalCreditAmt(BigDecimal totalCreditAmt) {
        TotalCreditAmt = totalCreditAmt;
    }

    public BigDecimal getTotalDebitAmt() {
        return TotalDebitAmt;
    }

    public void setTotalDebitAmt(BigDecimal totalDebitAmt) {
        TotalDebitAmt = totalDebitAmt;
    }
}
