package com.greentrade.common.domain.portfolio;

public class CustPortfolioOrderRealtime {
    private String secCd;
    private Double quantity;
    private Double investAmt;
    private Double buyPrice;
    private Double sellPrice;
    private Double profitAmt;
    private Double profitPercent;

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getInvestAmt() {
        return investAmt;
    }

    public void setInvestAmt(Double investAmt) {
        this.investAmt = investAmt;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getProfitAmt() {
        return profitAmt;
    }

    public void setProfitAmt(Double profitAmt) {
        this.profitAmt = profitAmt;
    }

    public Double getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(Double profitPercent) {
        this.profitPercent = profitPercent;
    }
}
