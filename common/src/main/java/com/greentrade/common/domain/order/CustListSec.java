package com.greentrade.common.domain.order;

import java.math.BigDecimal;

public class CustListSec {
    private String SecCd;
    private BigDecimal TotalQty;		// Tổng
    private BigDecimal AvailSellQty;	// Có thể bán
    private BigDecimal T2PrevQty;		// T-2 (hôm nay về)
    private BigDecimal T1PrevQty;		// T-1 (mai về)
    private BigDecimal T0BuyQty;		// Mua T0 (Mua trong ngày)
    private BigDecimal T0SellQty;		// Bán T0 (Bán trong ngày)
    private BigDecimal RightPendingQty;	// Quyền chờ về

    public BigDecimal getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        TotalQty = totalQty;
    }

    public BigDecimal getAvailSellQty() {
        return AvailSellQty;
    }

    public void setAvailSellQty(BigDecimal availSellQty) {
        AvailSellQty = availSellQty;
    }

    public BigDecimal getT2PrevQty() {
        return T2PrevQty;
    }

    public void setT2PrevQty(BigDecimal t2PrevQty) {
        T2PrevQty = t2PrevQty;
    }

    public BigDecimal getT1PrevQty() {
        return T1PrevQty;
    }

    public void setT1PrevQty(BigDecimal t1PrevQty) {
        T1PrevQty = t1PrevQty;
    }

    public BigDecimal getT0BuyQty() {
        return T0BuyQty;
    }

    public void setT0BuyQty(BigDecimal t0BuyQty) {
        T0BuyQty = t0BuyQty;
    }

    public BigDecimal getT0SellQty() {
        return T0SellQty;
    }

    public void setT0SellQty(BigDecimal t0SellQty) {
        T0SellQty = t0SellQty;
    }

    public BigDecimal getRightPendingQty() {
        return RightPendingQty;
    }

    public void setRightPendingQty(BigDecimal rightPendingQty) {
        RightPendingQty = rightPendingQty;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }
}
