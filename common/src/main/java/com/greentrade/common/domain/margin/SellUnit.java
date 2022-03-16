package com.greentrade.common.domain.margin;

public class SellUnit {
    private String subAccoNo;
    private String secCd;
    private Double needSellQty;
    private Double sellPrice;

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getNeedSellQty() {
        return needSellQty;
    }

    public void setNeedSellQty(Double needsellQty) {
        this.needSellQty = needsellQty;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
