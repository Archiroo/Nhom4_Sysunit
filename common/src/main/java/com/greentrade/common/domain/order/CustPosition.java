package com.greentrade.common.domain.order;

import java.math.BigDecimal;
import java.util.Date;

public class CustPosition {
    private Date BuyDate;
    private String SecCd;
    private BigDecimal BuyQty;
    private BigDecimal BuyPriceTotal;
    private BigDecimal BuyAmtTotal;
    private BigDecimal CurrentAmt;
    private BigDecimal ProfitAmt;
    private BigDecimal ProfitPercent;

    public Date getBuyDate() {
        return BuyDate;
    }

    public void setBuyDate(Date buyDate) {
        BuyDate = buyDate;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public BigDecimal getBuyQty() {
        return BuyQty;
    }

    public void setBuyQty(BigDecimal buyQty) {
        BuyQty = buyQty;
    }

    public BigDecimal getBuyPriceTotal() {
        return BuyPriceTotal;
    }

    public void setBuyPriceTotal(BigDecimal buyPriceTotal) {
        BuyPriceTotal = buyPriceTotal;
    }

    public BigDecimal getBuyAmtTotal() {
        return BuyAmtTotal;
    }

    public void setBuyAmtTotal(BigDecimal buyAmtTotal) {
        BuyAmtTotal = buyAmtTotal;
    }

    public BigDecimal getCurrentAmt() {
        return CurrentAmt;
    }

    public void setCurrentAmt(BigDecimal currentAmt) {
        CurrentAmt = currentAmt;
    }

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }

    public BigDecimal getProfitPercent() {
        return ProfitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        ProfitPercent = profitPercent;
    }
}
