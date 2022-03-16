package com.greentrade.common.domain.order;

import java.math.BigDecimal;

public class OrderChangeMatching {
    private int id;
    private String SubAccoNo;
    private BigDecimal MatQty;
    private BigDecimal MatAmt;
    private BigDecimal MatPrice;
    private BigDecimal PubQty;
    private int OrderStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMatQty() {
        return MatQty;
    }

    public void setMatQty(BigDecimal matQty) {
        MatQty = matQty;
    }

    public BigDecimal getMatAmt() {
        return MatAmt;
    }

    public void setMatAmt(BigDecimal matAmt) {
        MatAmt = matAmt;
    }

    public BigDecimal getMatPrice() {
        return MatPrice;
    }

    public void setMatPrice(BigDecimal matPrice) {
        MatPrice = matPrice;
    }

    public BigDecimal getPubQty() {
        return PubQty;
    }

    public void setPubQty(BigDecimal pubQty) {
        PubQty = pubQty;
    }

    public int getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }
}
