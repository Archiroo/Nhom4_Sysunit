package com.greentrade.common.domain.order;

import java.util.Date;

public class OrdOrderHist {
    private Date tradeDate;
    private Integer id;
    private Integer reqType;
    private Integer subAccoCd;
    private String subAccoNo;
    private Integer custCd;
    private String custNo;
    private String custName;
    private String custUnitCode;
    private Integer tradeType;
    private String marketCd;
    private String secCd;
    private Integer secType;
    private Double orderQty;
    private String orderType;
    private Double orderPrice;
    private Double orderAmt;
    private Double feeAmt;
    private Double taxAmt;
    private Double loanRate;
    private Double loanAmt;
    private Double interestAmt;
    private Double depositRate;
    private Double depositAmt;
    private Double pubQty;
    private Double pubPrice;
    private Double cancelQty;
    private Double matQty;
    private Double matAmt;
    private Double matPrice;
    private Boolean isResolve;
    private Integer settleUnit;
    private Date paymentDate;
    private Double availBefore;
    private Double availAfter;
    private Integer introCustId;
    private String companyCd;
    private Integer orderStatus;
    private Integer cancelStatus;
    private Integer channel;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private String userInput;

    private Date startDate;
    private Date endDate;

    private boolean isCC;
    private String waitUserId;
    private Date waitTime;
    private String enterUserId;
    private Date enterTime;

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReqType() {
        return reqType;
    }

    public void setReqType(Integer reqType) {
        this.reqType = reqType;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Integer getCustCd() {
        return custCd;
    }

    public void setCustCd(Integer custCd) {
        this.custCd = custCd;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustUnitCode() {
        return custUnitCode;
    }

    public void setCustUnitCode(String custUnitCode) {
        this.custUnitCode = custUnitCode;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public String getMarketCd() {
        return marketCd;
    }

    public void setMarketCd(String marketCd) {
        this.marketCd = marketCd;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Integer getSecType() {
        return secType;
    }

    public void setSecType(Integer secType) {
        this.secType = secType;
    }

    public Double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Double orderQty) {
        this.orderQty = orderQty;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(Double orderAmt) {
        this.orderAmt = orderAmt;
    }

    public Double getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Double loanRate) {
        this.loanRate = loanRate;
    }

    public Double getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(Double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Double getInterestAmt() {
        return interestAmt;
    }

    public void setInterestAmt(Double interestAmt) {
        this.interestAmt = interestAmt;
    }

    public Double getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    public Double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public Double getPubQty() {
        return pubQty;
    }

    public void setPubQty(Double pubQty) {
        this.pubQty = pubQty;
    }

    public Double getPubPrice() {
        return pubPrice;
    }

    public void setPubPrice(Double pubPrice) {
        this.pubPrice = pubPrice;
    }

    public Double getCancelQty() {
        return cancelQty;
    }

    public void setCancelQty(Double cancelQty) {
        this.cancelQty = cancelQty;
    }

    public Double getMatQty() {
        return matQty;
    }

    public void setMatQty(Double matQty) {
        this.matQty = matQty;
    }

    public Double getMatAmt() {
        return matAmt;
    }

    public void setMatAmt(Double matAmt) {
        this.matAmt = matAmt;
    }

    public Double getMatPrice() {
        return matPrice;
    }

    public void setMatPrice(Double matPrice) {
        this.matPrice = matPrice;
    }

    public Boolean getIsResolve() {
        return isResolve;
    }

    public void setIsResolve(Boolean isResolve) {
        this.isResolve = isResolve;
    }

    public Integer getSettleUnit() {
        return settleUnit;
    }

    public void setSettleUnit(Integer settleUnit) {
        this.settleUnit = settleUnit;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getAvailBefore() {
        return availBefore;
    }

    public void setAvailBefore(Double availBefore) {
        this.availBefore = availBefore;
    }

    public Double getAvailAfter() {
        return availAfter;
    }

    public void setAvailAfter(Double availAfter) {
        this.availAfter = availAfter;
    }

    public Integer getIntroCustId() {
        return introCustId;
    }

    public void setIntroCustId(Integer introCustId) {
        this.introCustId = introCustId;
    }

    public String getCompanyCd() {
        return companyCd;
    }

    public void setCompanyCd(String companyCd) {
        this.companyCd = companyCd;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(Integer cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public boolean getIsCC() {
        return isCC;
    }

    public void setIsCC(boolean isCC) {
        this.isCC = isCC;
    }

    public String getWaitUserId() {
        return waitUserId;
    }

    public void setWaitUserId(String waitUserId) {
        this.waitUserId = waitUserId;
    }

    public Date getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Date waitTime) {
        this.waitTime = waitTime;
    }

    public String getEnterUserId() {
        return enterUserId;
    }

    public void setEnterUserId(String enterUserId) {
        this.enterUserId = enterUserId;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }
}
