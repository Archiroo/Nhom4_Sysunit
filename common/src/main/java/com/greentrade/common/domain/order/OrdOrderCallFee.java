package com.greentrade.common.domain.order;

public class OrdOrderCallFee {
    private Integer ReqType; // 1.Đặt lệnh báo giá
    private Integer SubAccoCd;
    private Integer TradeType; // 1.Bán, 2.Mua
    private String SecCd; // Mã CK
    private Double OrderQty; // Khối lượng
    private String OrderType; // Loại giá: LO, ATO, ATC,...
    private Double OrderPrice;
    private Double FeeAmt; // Phí
    private Double TaxAmt; // Thuế
    private Double DepositAmt; // Cọc yêu cầu
    private Double LoanAmt; // Giải ngân
    private Double InterestAmt; // Lãi

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

    public Double getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        FeeAmt = feeAmt;
    }

    public Double getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        TaxAmt = taxAmt;
    }

    public Double getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        DepositAmt = depositAmt;
    }

    public Double getLoanAmt() {
        return LoanAmt;
    }

    public void setLoanAmt(Double loanAmt) {
        LoanAmt = loanAmt;
    }

    public Double getInterestAmt() {
        return InterestAmt;
    }

    public void setInterestAmt(Double interestAmt) {
        InterestAmt = interestAmt;
    }
}
