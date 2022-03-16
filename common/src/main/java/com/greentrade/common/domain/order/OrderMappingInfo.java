package com.greentrade.common.domain.order;

public class OrderMappingInfo {
    private String FromCompanyCd;
    private String FromCustNo;
    private String OrderNo;
    private String Remarks;
    private Double Qty;

    public String getFromCompanyCd() {
        return FromCompanyCd;
    }

    public void setFromCompanyCd(String fromCompanyCd) {
        FromCompanyCd = fromCompanyCd;
    }

    public String getFromCustNo() {
        return FromCustNo;
    }

    public void setFromCustNo(String fromCustNo) {
        FromCustNo = fromCustNo;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public Double getQty() {
        return Qty;
    }

    public void setQty(Double qty) {
        Qty = qty;
    }
}
