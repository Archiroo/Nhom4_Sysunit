package com.greentrade.common.domain.margin;

import java.math.BigDecimal;

public class AssetMonitorData {
    private Double TodayBuyMatAmt; // Mua khớp trong ngày
    private Double TodaySellMatAmt; // Bán khớp trong ngày
    private Double TodayBuyPubAmt; // Dự Mua khớp trong ngày
    private Double TodaySellPubAmt; // Dự Bán khớp trong ngày

    private BigDecimal TotalSecVal; // Tổng GT danh mục
    private BigDecimal Nav; // Tổng GT danh mục
    private BigDecimal TotalProfitAmt; // Tổng lãi lỗ
    private BigDecimal DepositAmt; // Số dư cọc
    private BigDecimal DepositAvailAmt; // Cọc khả dụng
    private BigDecimal WithdrawAvailAmt; // Cọc khả dụng

    public Double getTodayBuyMatAmt() {
        return TodayBuyMatAmt;
    }

    public void setTodayBuyMatAmt(Double todayBuyMatAmt) {
        TodayBuyMatAmt = todayBuyMatAmt;
    }

    public Double getTodaySellMatAmt() {
        return TodaySellMatAmt;
    }

    public void setTodaySellMatAmt(Double todaySellMatAmt) {
        TodaySellMatAmt = todaySellMatAmt;
    }

    public Double getTodayBuyPubAmt() {
        return TodayBuyPubAmt;
    }

    public void setTodayBuyPubAmt(Double todayBuyPubAmt) {
        TodayBuyPubAmt = todayBuyPubAmt;
    }

    public Double getTodaySellPubAmt() {
        return TodaySellPubAmt;
    }

    public void setTodaySellPubAmt(Double todaySellPubAmt) {
        TodaySellPubAmt = todaySellPubAmt;
    }

    public BigDecimal getTotalSecVal() {
        return TotalSecVal;
    }

    public void setTotalSecVal(BigDecimal totalSecVal) {
        TotalSecVal = totalSecVal;
    }

    public BigDecimal getNav() {
        return Nav;
    }

    public void setNav(BigDecimal nav) {
        Nav = nav;
    }

    public BigDecimal getTotalProfitAmt() {
        return TotalProfitAmt;
    }

    public void setTotalProfitAmt(BigDecimal totalProfitAmt) {
        TotalProfitAmt = totalProfitAmt;
    }

    public BigDecimal getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(BigDecimal depositAmt) {
        DepositAmt = depositAmt;
    }

    public BigDecimal getDepositAvailAmt() {
        return DepositAvailAmt;
    }

    public void setDepositAvailAmt(BigDecimal depositAvailAmt) {
        DepositAvailAmt = depositAvailAmt;
    }

    public BigDecimal getWithdrawAvailAmt() {
        return WithdrawAvailAmt;
    }

    public void setWithdrawAvailAmt(BigDecimal withdrawAvailAmt) {
        WithdrawAvailAmt = withdrawAvailAmt;
    }
}
