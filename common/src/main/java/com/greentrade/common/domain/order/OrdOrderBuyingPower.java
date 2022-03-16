package com.greentrade.common.domain.order;

import java.math.BigDecimal;

public class OrdOrderBuyingPower {
    private Integer subAccoCd;
    private String secCd;
    private Integer numOfDay;	// Số ngày tính lãi
    private BigDecimal feeRate;     // Phí mua
    private BigDecimal secSellAvail;	// Sức mua Margin theo mã CK
    private BigDecimal buyingPower;	// Sức mua Margin theo mã CK
    private BigDecimal depositRate; // Tỷ lệ cọc yêu cầu
    private BigDecimal loanRate; // Tỷ lệ giải ngân
    private BigDecimal interestRate; // Tỷ lệ lãi vay
    private BigDecimal remainLimit; // Hạn mức KH còn lại
    private BigDecimal remainRoom; // Room còn lại của Mã CK
    private BigDecimal balanceAmt; // Room còn lại của Mã CK
    private BigDecimal depositAvail; // Room còn lại của Mã CK
    private Boolean isError;
    private String errorMsg;

    public BigDecimal getSecSellAvail() {
        return secSellAvail;
    }

    public void setSecSellAvail(BigDecimal secSellAvail) {
        this.secSellAvail = secSellAvail;
    }

    public Integer getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(Integer numOfDay) {
        this.numOfDay = numOfDay;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(BigDecimal balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public BigDecimal getDepositAvail() {
        return depositAvail;
    }

    public void setDepositAvail(BigDecimal depositAvail) {
        this.depositAvail = depositAvail;
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
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

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getRemainLimit() {
        return remainLimit;
    }

    public void setRemainLimit(BigDecimal remainLimit) {
        this.remainLimit = remainLimit;
    }

    public BigDecimal getRemainRoom() {
        return remainRoom;
    }

    public void setRemainRoom(BigDecimal remainRoom) {
        this.remainRoom = remainRoom;
    }
}
