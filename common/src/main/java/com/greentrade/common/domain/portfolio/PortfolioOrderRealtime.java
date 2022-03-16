package com.greentrade.common.domain.portfolio;

public class PortfolioOrderRealtime {
    private Integer type;
    private int subAccoCd;
    private String subAccoNo;
    private String custName;
    private String secCd;
    private Double quantity;
    private Double investAmt;
    private Double buyPrice;
    private Double sellPrice;
    private Double profitAmt;
    private Double profitPercent;
    private Double calBuyingAmt;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public int getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

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

    public Double getCalBuyingAmt() {
        return calBuyingAmt;
    }

    public void setCalBuyingAmt(Double calBuyingAmt) {
        this.calBuyingAmt = calBuyingAmt;
    }
}
