package com.greentrade.common.domain.order;

public class OrdOrderListSec {
    private Integer subAccoCd;
    private String secCd;
    private Double TotalQty;
    private Double AvailSellQty;
    private Double T2PrevQty;
    private Double T1PrevQty;
    private Double T0BuyQty;
    private Double T0SellQty;
    private Double RightPendingQty;

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
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

    public Double getT2PrevQty() {
        return T2PrevQty;
    }

    public void setT2PrevQty(Double t2PrevQty) {
        T2PrevQty = t2PrevQty;
    }

    public Double getT1PrevQty() {
        return T1PrevQty;
    }

    public void setT1PrevQty(Double t1PrevQty) {
        T1PrevQty = t1PrevQty;
    }

    public Double getT0BuyQty() {
        return T0BuyQty;
    }

    public void setT0BuyQty(Double t0BuyQty) {
        T0BuyQty = t0BuyQty;
    }

    public Double getT0SellQty() {
        return T0SellQty;
    }

    public void setT0SellQty(Double t0SellQty) {
        T0SellQty = t0SellQty;
    }

    public Double getRightPendingQty() {
        return RightPendingQty;
    }

    public void setRightPendingQty(Double rightPendingQty) {
        RightPendingQty = rightPendingQty;
    }
}
