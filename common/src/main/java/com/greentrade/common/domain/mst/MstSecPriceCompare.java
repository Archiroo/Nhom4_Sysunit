package com.greentrade.common.domain.mst;
import java.io.Serializable;
import java.util.Date;

public class MstSecPriceCompare implements Serializable {
    private String secCd;
    private String marketCd;
    private Double currentBasicPrice;
    private Double lastAvgPrice;
    private Double lastClosePrice;

    public Double getLastAvgPrice() {
        return lastAvgPrice;
    }

    public void setLastAvgPrice(Double lastAvgPrice) {
        this.lastAvgPrice = lastAvgPrice;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public String getMarketCd() {
        return marketCd;
    }

    public void setMarketCd(String marketCd) {
        this.marketCd = marketCd;
    }

    public Double getCurrentBasicPrice() {
        return currentBasicPrice;
    }

    public void setCurrentBasicPrice(Double currentBasicPrice) {
        this.currentBasicPrice = currentBasicPrice;
    }

    public Double getLastClosePrice() {
        return lastClosePrice;
    }

    public void setLastClosePrice(Double lastClosePrice) {
        this.lastClosePrice = lastClosePrice;
    }
}
