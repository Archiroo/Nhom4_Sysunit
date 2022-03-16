package com.greentrade.common.domain.portfolio;

import java.math.BigDecimal;

public class CustPorfolioDistribution {
    private String SecCd;
    private BigDecimal Qty;
    private BigDecimal Price;
    private BigDecimal Value;
    private BigDecimal Rate;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public BigDecimal getQty() {
        return Qty;
    }

    public void setQty(BigDecimal qty) {
        Qty = qty;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal value) {
        Value = value;
    }

    public BigDecimal getRate() {
        return Rate;
    }

    public void setRate(BigDecimal rate) {
        Rate = rate;
    }
}
