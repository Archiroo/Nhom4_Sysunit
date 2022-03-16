package com.greentrade.common.domain.right;

import java.math.BigDecimal;
import java.util.Date;

public class CustCapitalIncreaseCurrent {
    private int Id;
    private String SecCd;
    private Double SecOwnerQty;
    private Date BeginRegDate;
    private Date EndRegDate;
    private Double AvailRegisterQty;
    private Double RegisteredQty;
    private Double PubQty;
    private Double Price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Double getSecOwnerQty() {
        return SecOwnerQty;
    }

    public void setSecOwnerQty(Double secOwnerQty) {
        SecOwnerQty = secOwnerQty;
    }

    public Date getBeginRegDate() {
        return BeginRegDate;
    }

    public void setBeginRegDate(Date beginRegDate) {
        BeginRegDate = beginRegDate;
    }

    public Date getEndRegDate() {
        return EndRegDate;
    }

    public void setEndRegDate(Date endRegDate) {
        EndRegDate = endRegDate;
    }

    public Double getAvailRegisterQty() {
        return AvailRegisterQty;
    }

    public void setAvailRegisterQty(Double availRegisterQty) {
        AvailRegisterQty = availRegisterQty;
    }

    public Double getRegisteredQty() {
        return RegisteredQty;
    }

    public void setRegisteredQty(Double registeredQty) {
        RegisteredQty = registeredQty;
    }

    public Double getPubQty() {
        return PubQty;
    }

    public void setPubQty(Double pubQty) {
        PubQty = pubQty;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

}
