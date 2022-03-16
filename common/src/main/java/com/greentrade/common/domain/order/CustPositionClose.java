package com.greentrade.common.domain.order;

import java.math.BigDecimal;
import java.util.Date;

public class CustPositionClose {
    private Date BuyDate;
    private String SecCd;
    private BigDecimal Qty; //Khối lượng
    private BigDecimal BuyPrice;
    private Date SellDate;
    private BigDecimal SellPrice;
    private BigDecimal TotalFeeTax;
    private BigDecimal InterestAmt; //Lãi vay
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

    public BigDecimal getQty() {
        return Qty;
    }

    public void setQty(BigDecimal qty) {
        Qty = qty;
    }

    public BigDecimal getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        BuyPrice = buyPrice;
    }

    public Date getSellDate() {
        return SellDate;
    }

    public void setSellDate(Date sellDate) {
        SellDate = sellDate;
    }

    public BigDecimal getSellPrice() {
        return SellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        SellPrice = sellPrice;
    }

    public BigDecimal getTotalFeeTax() {
        return TotalFeeTax;
    }

    public void setTotalFeeTax(BigDecimal totalFeeTax) {
        TotalFeeTax = totalFeeTax;
    }

    public BigDecimal getInterestAmt() {
        return InterestAmt;
    }

    public void setInterestAmt(BigDecimal interestAmt) {
        InterestAmt = interestAmt;
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
