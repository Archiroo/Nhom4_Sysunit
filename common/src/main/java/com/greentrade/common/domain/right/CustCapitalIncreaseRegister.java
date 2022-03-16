package com.greentrade.common.domain.right;

import java.util.Date;

public class CustCapitalIncreaseRegister {
    private String SecCd;
    private Date OwnerFixDate;
    private Date ApplyDate;
    private int ActionType;
    private Double ApplyQty;
    private Double Price;
    private Double Amount;
    private int Status;

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Date getOwnerFixDate() {
        return OwnerFixDate;
    }

    public void setOwnerFixDate(Date ownerFixDate) {
        OwnerFixDate = ownerFixDate;
    }

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date applyDate) {
        ApplyDate = applyDate;
    }

    public int getActionType() {
        return ActionType;
    }

    public void setActionType(int actionType) {
        ActionType = actionType;
    }

    public Double getApplyQty() {
        return ApplyQty;
    }

    public void setApplyQty(Double applyQty) {
        ApplyQty = applyQty;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
