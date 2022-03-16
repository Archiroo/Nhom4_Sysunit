package com.greentrade.common.domain.cash;

import java.io.Serializable;
import java.util.Date;

public class CorCashTrans implements Serializable {

    private Date startDate;
    private Date endDate;

    private String subAccoNo;
    private Integer subAccoCd;
    private String custNo;
    private Integer custCd;
    private String custName;

    private Date alloDate;
    private Integer refNo;
    private Date effectDate;

    private Double balanceAmt;
    private Double depositAvailAmt;
    private Double withdrawAvailAmt;
    private Double withdraw;

    private Integer tradeType;
    private Double amount;
    private Integer status;
    private String unitCode;
    private String description;
    private Integer moneySourceId;
    private Integer channel;

    private String approvedUserId;
    private Date approvedTime;
    private String cancelledUserId;
    private Date cancelledTime;

    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public Integer getCustCd() {
        return custCd;
    }

    public void setCustCd(Integer custCd) {
        this.custCd = custCd;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Double getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(Double balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public Double getDepositAvailAmt() {
        return depositAvailAmt;
    }

    public void setDepositAvailAmt(Double depositAvailAmt) {
        this.depositAvailAmt = depositAvailAmt;
    }

    public Double getWithdrawAvailAmt() {
        return withdrawAvailAmt;
    }

    public void setWithdrawAvailAmt(Double withdrawAvailAmt) {
        this.withdrawAvailAmt = withdrawAvailAmt;
    }

    public Double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Double withdraw) {
        this.withdraw = withdraw;
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

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Date getAlloDate() {
        return alloDate;
    }

    public void setAlloDate(Date alloDate) {
        this.alloDate = alloDate;
    }

    public Integer getRefNo() {
        return refNo;
    }

    public void setRefNo(Integer refNo) {
        this.refNo = refNo;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMoneySourceId() {
        return moneySourceId;
    }

    public void setMoneySourceId(Integer moneySourceId) {
        this.moneySourceId = moneySourceId;
    }

    public String getApprovedUserId() {
        return approvedUserId;
    }

    public void setApprovedUserId(String approvedUserId) {
        this.approvedUserId = approvedUserId;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getCancelledUserId() {
        return cancelledUserId;
    }

    public void setCancelledUserId(String cancelledUserId) {
        this.cancelledUserId = cancelledUserId;
    }

    public Date getCancelledTime() {
        return cancelledTime;
    }

    public void setCancelledTime(Date cancelledTime) {
        this.cancelledTime = cancelledTime;
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
}
