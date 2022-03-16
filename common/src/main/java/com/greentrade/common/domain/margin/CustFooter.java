package com.greentrade.common.domain.margin;

import java.math.BigDecimal;

public class CustFooter {
    private BigDecimal Nav;
    private BigDecimal DepositAvail;
    private BigDecimal Rtt;
    private BigDecimal ProfitAmt;

    public BigDecimal getNav() {
        return Nav;
    }

    public void setNav(BigDecimal nav) {
        Nav = nav;
    }

    public BigDecimal getDepositAvail() {
        return DepositAvail;
    }

    public void setDepositAvail(BigDecimal depositAvail) {
        DepositAvail = depositAvail;
    }

    public BigDecimal getRtt() {
        return Rtt;
    }

    public void setRtt(BigDecimal rtt) {
        Rtt = rtt;
    }

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }
}
