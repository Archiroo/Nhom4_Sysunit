package com.greentrade.common.domain.order;

public class CustOrderSubmit {
    private String SubAccoNo;
    private String SecCd;
    private int TradeType;
    private Double OrderPrice;
    private Double OrderQty;
    private String OrderType;
    private int SecType;

    private String PinCode;

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

    public Double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        OrderPrice = orderPrice;
    }

    public Double getOrderQty() {
        return OrderQty;
    }

    public void setOrderQty(Double orderQty) {
        OrderQty = orderQty;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public int getSecType() {
        return SecType;
    }

    public void setSecType(int secType) {
        SecType = secType;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }
}
