package com.greentrade.common.domain.margin;


public class AssetMonitorSec {
    private String SecCd;

    private Double TotalQty;  // Tổng
    private Double AvailSellQty;  // Có thể bán
    private Double T0BuyQty;  //  Mua T0 (Mua trong ngày)
    private Double T1PrevBuyQty;  // Mua T-1 (mai về)
    private Double T2PrevBuyQty;  // Mua T-2 (hôm nay về)
    private Double T0SellQty;  // Bán T0 (Bán trong ngày)
    private Double AvgPrice;  // Giá vốn
    private Double MarketPrice;  // Giá hiện tại
    private Double InvestAmt;  // Giá trị đầu tư
    private Double MarketAmt;  // Giá trị hiện tại
    private Double RightPostedQty;  // Cổ tức CP đã chuyển giao dịch
    private Double RightPendingQty;  // Cổ tức CP chờ giao dịch

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Double getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(Double totalQty) {
        TotalQty = totalQty;
    }

    public Double getAvailSellQty() {
        return AvailSellQty;
    }

    public void setAvailSellQty(Double availSellQty) {
        AvailSellQty = availSellQty;
    }

    public Double getT0BuyQty() {
        return T0BuyQty;
    }

    public void setT0BuyQty(Double t0BuyQty) {
        T0BuyQty = t0BuyQty;
    }

    public Double getT1PrevBuyQty() {
        return T1PrevBuyQty;
    }

    public void setT1PrevBuyQty(Double t1PrevBuyQty) {
        T1PrevBuyQty = t1PrevBuyQty;
    }

    public Double getT2PrevBuyQty() {
        return T2PrevBuyQty;
    }

    public void setT2PrevBuyQty(Double t2PrevBuyQty) {
        T2PrevBuyQty = t2PrevBuyQty;
    }

    public Double getT0SellQty() {
        return T0SellQty;
    }

    public void setT0SellQty(Double t0SellQty) {
        T0SellQty = t0SellQty;
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

    public Double getInvestAmt() {
        return InvestAmt;
    }

    public void setInvestAmt(Double investAmt) {
        InvestAmt = investAmt;
    }

    public Double getMarketAmt() {
        return MarketAmt;
    }

    public void setMarketAmt(Double marketAmt) {
        MarketAmt = marketAmt;
    }

    public Double getRightPostedQty() {
        return RightPostedQty;
    }

    public void setRightPostedQty(Double rightPostedQty) {
        RightPostedQty = rightPostedQty;
    }

    public Double getRightPendingQty() {
        return RightPendingQty;
    }

    public void setRightPendingQty(Double rightPendingQty) {
        RightPendingQty = rightPendingQty;
    }
}
