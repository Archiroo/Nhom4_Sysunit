package com.greentrade.common.domain.portfolio;

public class CustPortfolioRealtime {
    private String SecCd;
    private Double RemainQty;
    private Double InvestAmt;
    private Double AvgPrice;
    private Double MarketPrice;
    private Double ProfitAmt;
    private Double ProfitPercent;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Double getRemainQty() {
        return RemainQty;
    }

    public void setRemainQty(Double remainQty) {
        RemainQty = remainQty;
    }

    public Double getInvestAmt() {
        return InvestAmt;
    }

    public void setInvestAmt(Double investAmt) {
        InvestAmt = investAmt;
    }

    public Double getAvgPrice() {
        return AvgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        AvgPrice = avgPrice;
    }

    public Double getMarketPrice() {
        return MarketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        MarketPrice = marketPrice;
    }

    public Double getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(Double profitAmt) {
        ProfitAmt = profitAmt;
    }

    public Double getProfitPercent() {
        return ProfitPercent;
    }

    public void setProfitPercent(Double profitPercent) {
        ProfitPercent = profitPercent;
    }
}
