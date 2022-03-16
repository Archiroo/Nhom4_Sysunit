package com.greentrade.common.domain.order;

import java.math.BigDecimal;

public class CustOrderBuyingPower {
    private BigDecimal depositAvail; // Room còn lại của Mã CK
    private BigDecimal buyingPower;	// Sức mua Margin theo mã CK
    private BigDecimal depositRate; // Room còn lại của Mã CK
    private BigDecimal secSellAvail; // Khối lượng bán tối đa
    private BigDecimal feeRate; // Tỉ lệ phí
    private BigDecimal interestRate; // Tỉ lệ lãi
    private BigDecimal loanRate; // Tỉ lệ giải ngân
    private Integer interestDay; // Số ngày tính lãi

    public BigDecimal getDepositAvail() {
        return depositAvail;
    }

    public void setDepositAvail(BigDecimal depositAvail) {
        this.depositAvail = depositAvail;
    }

    public BigDecimal getBuyingPower() {
        return buyingPower;
    }

    public void setBuyingPower(BigDecimal buyingPower) {
        this.buyingPower = buyingPower;
    }

    public BigDecimal getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(BigDecimal depositRate) {
        this.depositRate = depositRate;
    }

    public BigDecimal getSecSellAvail() {
        return secSellAvail;
    }

    public void setSecSellAvail(BigDecimal secSellAvail) {
        this.secSellAvail = secSellAvail;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public Integer getInterestDay() {
        return interestDay;
    }

    public void setInterestDay(Integer interestDay) {
        this.interestDay = interestDay;
    }
}
