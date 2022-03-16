package com.greentrade.common.domain.margin;

public class InquiryStockInfo {
    private String secCd;
    private Double pubQty;
    private Double buyT0Qty;
    private Double buyT1Qty;
    private Double buyT3Qty;
    private Double sellT0Qty;
    private Double sellT1Qty;
    private Double sellT2Qty;
    private Double loanRate;
    private Double avgPrice;
    private Double marketPrice;
    private Double invesAmt;
    private Double marketAmt;
    private Double stockDividendTrade;
    private Double stockDividendPay;

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getPubQty() {
        return pubQty;
    }

    public void setPubQty(Double pubQty) {
        this.pubQty = pubQty;
    }

    public Double getBuyT0Qty() {
        return buyT0Qty;
    }

    public void setBuyT0Qty(Double buyT0Qty) {
        this.buyT0Qty = buyT0Qty;
    }

    public Double getBuyT1Qty() {
        return buyT1Qty;
    }

    public void setBuyT1Qty(Double buyT1Qty) {
        this.buyT1Qty = buyT1Qty;
    }

    public Double getBuyT3Qty() {
        return buyT3Qty;
    }

    public void setBuyT3Qty(Double buyT3Qty) {
        this.buyT3Qty = buyT3Qty;
    }

    public Double getSellT0Qty() {
        return sellT0Qty;
    }

    public void setSellT0Qty(Double sellT0Qty) {
        this.sellT0Qty = sellT0Qty;
    }

    public Double getSellT1Qty() {
        return sellT1Qty;
    }

    public void setSellT1Qty(Double sellT1Qty) {
        this.sellT1Qty = sellT1Qty;
    }

    public Double getSellT2Qty() {
        return sellT2Qty;
    }

    public void setSellT2Qty(Double sellT2Qty) {
        this.sellT2Qty = sellT2Qty;
    }

    public Double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Double loanRate) {
        this.loanRate = loanRate;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getInvesAmt() {
        return invesAmt;
    }

    public void setInvesAmt(Double invesAmt) {
        this.invesAmt = invesAmt;
    }

    public Double getMarketAmt() {
        return marketAmt;
    }

    public void setMarketAmt(Double marketAmt) {
        this.marketAmt = marketAmt;
    }

    public Double getStockDividendTrade() {
        return stockDividendTrade;
    }

    public void setStockDividendTrade(Double stockDividendTrade) {
        this.stockDividendTrade = stockDividendTrade;
    }

    public Double getStockDividendPay() {
        return stockDividendPay;
    }

    public void setStockDividendPay(Double stockDividendPay) {
        this.stockDividendPay = stockDividendPay;
    }
}
