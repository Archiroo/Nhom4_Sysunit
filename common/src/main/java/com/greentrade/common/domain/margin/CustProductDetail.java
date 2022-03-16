package com.greentrade.common.domain.margin;

import java.math.BigDecimal;
import java.util.Date;

public class CustProductDetail {
    private String SecCd;
    private String SecSName;
    private String MarketSName;
    private BigDecimal DepositRate;
    private BigDecimal LoanRate;
    private String Name;

    private Date FromDate;
    private Date ToDate;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public String getSecSName() {
        return SecSName;
    }

    public void setSecSName(String secSName) {
        SecSName = secSName;
    }

    public String getMarketSName() {
        return MarketSName;
    }

    public void setMarketSName(String marketSName) {
        MarketSName = marketSName;
    }

    public BigDecimal getDepositRate() {
        return DepositRate;
    }

    public void setDepositRate(BigDecimal depositRate) {
        DepositRate = depositRate;
    }

    public BigDecimal getLoanRate() {
        return LoanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        LoanRate = loanRate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
    }
}
