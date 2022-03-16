package com.greentrade.common.domain.order;

import java.util.Date;

public class CusOrderHistCondition {
    private Date FromDate;
    private Date ToDate;
    private String SecCd;
    private int TradeType;
    private int OrderStatusNew;
    private String SubAccoNo;

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
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

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }
}
