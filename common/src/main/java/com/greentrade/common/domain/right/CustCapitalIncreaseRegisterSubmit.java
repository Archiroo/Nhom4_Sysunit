package com.greentrade.common.domain.right;

import java.util.Date;

public class CustCapitalIncreaseRegisterSubmit {
    private int Id;
    private String SubAccoNo;
    private int ActionType;
    private Double Qty;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public int getActionType() {
        return ActionType;
    }

    public void setActionType(int actionType) {
        ActionType = actionType;
    }

    public Double getQty() {
        return Qty;
    }

    public void setQty(Double qty) {
        Qty = qty;
    }
}
