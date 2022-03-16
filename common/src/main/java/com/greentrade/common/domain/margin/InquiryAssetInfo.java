package com.greentrade.common.domain.margin;

public class InquiryAssetInfo {
    private Double matBuyOrderAmt; //mua khớp trong ngày
    private Double matSellOrderAmt; //bán khớp trong ngày
    private Double totalBuyOrderAmt; //dự mua khớp
    private Double totalSellOrderAmt; //dự bán khớp
    private Double smsFee; //phí sms
    private Double otherFee; //phí khác
    private Double totalInves;//tổng giải ngân
    private Double totalProfit;//tổng lãi
    private Double totalPflAmt; //tổng danh mục
    private Double nav;
    private Double profit; //lãi/lỗ
    private Double depositeRate; //tỷ lệ kí quỹ
    private Double buyPowerAmt; // sức mua tối đa
    private Double withdrawAvailAmt; // số dư cọc
    private Double depositeAvailAmt; // cọc khả dụng

    public Double getMatBuyOrderAmt() {
        return matBuyOrderAmt;
    }

    public void setMatBuyOrderAmt(Double matBuyOrderAmt) {
        this.matBuyOrderAmt = matBuyOrderAmt;
    }

    public Double getMatSellOrderAmt() {
        return matSellOrderAmt;
    }

    public void setMatSellOrderAmt(Double matSellOrderAmt) {
        this.matSellOrderAmt = matSellOrderAmt;
    }

    public Double getTotalBuyOrderAmt() {
        return totalBuyOrderAmt;
    }

    public void setTotalBuyOrderAmt(Double totalBuyOrderAmt) {
        this.totalBuyOrderAmt = totalBuyOrderAmt;
    }

    public Double getTotalSellOrderAmt() {
        return totalSellOrderAmt;
    }

    public void setTotalSellOrderAmt(Double totalSellOrderAmt) {
        this.totalSellOrderAmt = totalSellOrderAmt;
    }

    public Double getSmsFee() {
        return smsFee;
    }

    public void setSmsFee(Double smsFee) {
        this.smsFee = smsFee;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    public Double getTotalInves() {
        return totalInves;
    }

    public void setTotalInves(Double totalInves) {
        this.totalInves = totalInves;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Double getTotalPflAmt() {
        return totalPflAmt;
    }

    public void setTotalPflAmt(Double totalPflAmt) {
        this.totalPflAmt = totalPflAmt;
    }

    public Double getNav() {
        return nav;
    }

    public void setNav(Double nav) {
        this.nav = nav;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getDepositeRate() {
        return depositeRate;
    }

    public void setDepositeRate(Double depositeRate) {
        this.depositeRate = depositeRate;
    }

    public Double getBuyPowerAmt() {
        return buyPowerAmt;
    }

    public void setBuyPowerAmt(Double buyPowerAmt) {
        this.buyPowerAmt = buyPowerAmt;
    }

    public Double getWithdrawAvailAmt() {
        return withdrawAvailAmt;
    }

    public void setWithdrawAvailAmt(Double withdrawAvailAmt) {
        this.withdrawAvailAmt = withdrawAvailAmt;
    }

    public Double getDepositeAvailAmt() {
        return depositeAvailAmt;
    }

    public void setDepositeAvailAmt(Double depositeAvailAmt) {
        this.depositeAvailAmt = depositeAvailAmt;
    }
}
