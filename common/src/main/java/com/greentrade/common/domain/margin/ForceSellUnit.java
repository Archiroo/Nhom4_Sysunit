package com.greentrade.common.domain.margin;

public class ForceSellUnit {
    private String secCd;
    private Double balanceQty;
    private Double marketPrice;
    private Double marketValue;
    private Double depositRate;
    private Double depositAmt;
    private Double distributeRate;
    private Double distributeAmt;
    private Double afterSellAmt;
    private Double needSellAmt;
    private Double sellPrice;
    private Double needSellQty;

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(Double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public Double getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    public Double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public Double getDistributeRate() {
        return distributeRate;
    }

    public void setDistributeRate(Double distributeRate) {
        this.distributeRate = distributeRate;
    }

    public Double getDistributeAmt() {
        return distributeAmt;
    }

    public void setDistributeAmt(Double distributeAmt) {
        this.distributeAmt = distributeAmt;
    }

    public Double getAfterSellAmt() {
        return afterSellAmt;
    }

    public void setAfterSellAmt(Double afterSellAmt) {
        this.afterSellAmt = afterSellAmt;
    }

    public Double getNeedSellAmt() {
        return needSellAmt;
    }

    public void setNeedSellAmt(Double needSellAmt) {
        this.needSellAmt = needSellAmt;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getNeedSellQty() {
        return needSellQty;
    }

    public void setNeedSellQty(Double needSellQty) {
        this.needSellQty = needSellQty;
    }
}
