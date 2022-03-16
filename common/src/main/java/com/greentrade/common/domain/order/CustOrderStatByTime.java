package com.greentrade.common.domain.order;

import java.math.BigDecimal;

public class CustOrderStatByTime {
    private int NumbOfOrders;
    private int NumOfProfitOrders;
    private int WinStreak;
    private BigDecimal MostProfitRate;
    private String MostProfitSecCd;

    public int getNumbOfOrders() {
        return NumbOfOrders;
    }

    public void setNumbOfOrders(int numbOfOrders) {
        NumbOfOrders = numbOfOrders;
    }

    public int getNumOfProfitOrders() {
        return NumOfProfitOrders;
    }

    public void setNumOfProfitOrders(int numOfProfitOrders) {
        NumOfProfitOrders = numOfProfitOrders;
    }

    public BigDecimal getMostProfitRate() {
        return MostProfitRate;
    }

    public void setMostProfitRate(BigDecimal mostProfitRate) {
        MostProfitRate = mostProfitRate;
    }

    public String getMostProfitSecCd() {
        return MostProfitSecCd;
    }

    public void setMostProfitSecCd(String mostProfitSecCd) {
        MostProfitSecCd = mostProfitSecCd;
    }

    public int getWinStreak() {
        return WinStreak;
    }

    public void setWinStreak(int winStreak) {
        WinStreak = winStreak;
    }
}
