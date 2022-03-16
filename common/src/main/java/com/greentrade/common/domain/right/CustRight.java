package com.greentrade.common.domain.right;

import java.util.Date;

public class CustRight {
    private String SecCd;
    private int RightType;
    private Date OwnerFixDate;
    private Date RightExecDate;
    private Date EndRegDate;
    private Double RateDividend;
    private Double RateIncrease;
    private Double Price;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public int getRightType() {
        return RightType;
    }

    public void setRightType(int rightType) {
        RightType = rightType;
    }

    public Date getOwnerFixDate() {
        return OwnerFixDate;
    }

    public void setOwnerFixDate(Date ownerFixDate) {
        OwnerFixDate = ownerFixDate;
    }

    public Date getRightExecDate() {
        return RightExecDate;
    }

    public void setRightExecDate(Date rightExecDate) {
        RightExecDate = rightExecDate;
    }

    public Date getEndRegDate() {
        return EndRegDate;
    }

    public void setEndRegDate(Date endRegDate) {
        EndRegDate = endRegDate;
    }

    public Double getRateDividend() {
        return RateDividend;
    }

    public void setRateDividend(Double rateDividend) {
        RateDividend = rateDividend;
    }

    public Double getRateIncrease() {
        return RateIncrease;
    }

    public void setRateIncrease(Double rateIncrease) {
        RateIncrease = rateIncrease;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
