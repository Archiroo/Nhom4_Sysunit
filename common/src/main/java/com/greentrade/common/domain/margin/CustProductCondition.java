package com.greentrade.common.domain.margin;

public class CustProductCondition {
    private int Type;
    private String Code;
    private Double InterRateMax;
    private Double InterRateMin;
    private Double DepositRateMax;
    private Double DepositRateMin;

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Double getInterRateMax() {
        return InterRateMax;
    }

    public void setInterRateMax(Double interRateMax) {
        InterRateMax = interRateMax;
    }

    public Double getInterRateMin() {
        return InterRateMin;
    }

    public void setInterRateMin(Double interRateMin) {
        InterRateMin = interRateMin;
    }

    public Double getDepositRateMax() {
        return DepositRateMax;
    }

    public void setDepositRateMax(Double depositRateMax) {
        DepositRateMax = depositRateMax;
    }

    public Double getDepositRateMin() {
        return DepositRateMin;
    }

    public void setDepositRateMin(Double depositRateMin) {
        DepositRateMin = depositRateMin;
    }
}
