package com.greentrade.common.domain.margin;

import java.math.BigDecimal;

public class CustProductDetailCondition {
    private String Code;
    private String SecCd;
    private BigDecimal DepositRateMax;
    private BigDecimal DepositRateMin;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public BigDecimal getDepositRateMax() {
        return DepositRateMax;
    }

    public void setDepositRateMax(BigDecimal depositRateMax) {
        DepositRateMax = depositRateMax;
    }

    public BigDecimal getDepositRateMin() {
        return DepositRateMin;
    }

    public void setDepositRateMin(BigDecimal depositRateMin) {
        DepositRateMin = depositRateMin;
    }
}
