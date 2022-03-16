package com.greentrade.common.domain.cash;

import java.util.Date;

public class CustDepositStatement {
    private Date EffectDate;
    private int Type;
    private int TradeType;
    private Double Amount;
    private Double PubAmount;
    private String Description;
    private String Remarks;

    public Date getEffectDate() {
        return EffectDate;
    }

    public void setEffectDate(Date effectDate) {
        EffectDate = effectDate;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Double getPubAmount() {
        return PubAmount;
    }

    public void setPubAmount(Double pubAmount) {
        PubAmount = pubAmount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }
}
