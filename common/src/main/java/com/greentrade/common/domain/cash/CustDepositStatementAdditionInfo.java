package com.greentrade.common.domain.cash;

public class CustDepositStatementAdditionInfo {
    private Double DepositAmt;
    private Double CashDividend;

    public Double getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        DepositAmt = depositAmt;
    }

    public Double getCashDividend() {
        return CashDividend;
    }

    public void setCashDividend(Double cashDividend) {
        CashDividend = cashDividend;
    }
}
