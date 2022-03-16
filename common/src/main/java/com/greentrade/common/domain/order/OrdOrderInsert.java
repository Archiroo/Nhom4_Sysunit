package com.greentrade.common.domain.order;

public class OrdOrderInsert {
    private Integer ReqType; // 1.Đặt lệnh báo giá
    private Integer SubAccoCd;
    private Integer TradeType; // 1.Bán, 2.Mua
    private String SecCd; // Mã CK
    private Integer SecType; // 1.T0, 2.T1, 3.T2
    private Double OrderQty; // Khối lượng
    private String OrderType; // Loại giá: LO, ATO, ATC,...
    private Double OrderPrice; // Giá đặt
    private Boolean IsResolve; // Lệnh giải chấp?
    private Integer Channel; // Kênh mương
    private String Remarks;

    private boolean IsCC;

    public Integer getReqType() {
        return ReqType;
    }

    public void setReqType(Integer reqType) {
        ReqType = reqType;
    }

    public Integer getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public Integer getTradeType() {
        return TradeType;
    }

    public void setTradeType(Integer tradeType) {
        TradeType = tradeType;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Integer getSecType() {
        return SecType;
    }

    public void setSecType(Integer secType) {
        SecType = secType;
    }

    public Double getOrderQty() {
        return OrderQty;
    }

    public void setOrderQty(Double orderQty) {
        OrderQty = orderQty;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public Double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        OrderPrice = orderPrice;
    }

    public Boolean getIsResolve() {
        return IsResolve;
    }

    public void setIsResolve(Boolean isResolve) {
        this.IsResolve = isResolve;
    }

    public Integer getChannel() {
        return Channel;
    }

    public void setChannel(Integer channel) {
        Channel = channel;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public boolean getIsCC() {
        return IsCC;
    }

    public void setIsCC(boolean isCC) {
        IsCC = isCC;
    }
}
