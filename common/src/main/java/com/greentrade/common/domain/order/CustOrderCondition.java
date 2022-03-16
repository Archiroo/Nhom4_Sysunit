package com.greentrade.common.domain.order;

public class CustOrderCondition {
    private String SubAccoNo;
    private String SecCd;
    private int TradeType;
    private int OrderStatusNew;

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public int getOrderStatusNew() {
        return OrderStatusNew;
    }

    public void setOrderStatusNew(int orderStatusNew) {
        OrderStatusNew = orderStatusNew;
    }
}
