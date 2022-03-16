package com.greentrade.common.domain.portfolio;

import java.util.Date;

public class PflPortfolioRealtime {
    private int SubAccoCd;
    private String SecCd;
    private Double RemainQty;
    private Double InvestAmt;
    private Double AvgPrice;
    private Double MarketPrice;
    private Double DepositAmt;
    private Double ProfitAmt;
    private Double ProfitPercent;
    private String SubAccoNo;
    private String CustName;

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

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

    public Double getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        DepositAmt = depositAmt;
    }

    public Double getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(Double profitAmt) {
        ProfitAmt = profitAmt;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public Double getProfitPercent() {
        return ProfitPercent;
    }

    public void setProfitPercent(Double profitPercent) {
        ProfitPercent = profitPercent;
    }
}
