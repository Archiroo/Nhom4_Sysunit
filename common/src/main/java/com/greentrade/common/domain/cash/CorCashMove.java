package com.greentrade.common.domain.cash;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CorCashMove implements Serializable {

    private Date startDate;
    private Date endDate;
    private String subAccoNo;

    private Date alloDate;

    private Integer refNo;

    private Date effectDate;

    private Integer subAccoCd;

    private String groupCd;

    private String taskCd;

    private Integer globalTransId;

    private Date srcDate;
    private Integer srcNo;
    private String srcUnitCode;
    private Double beginAmt;
    private Double amount;
    private String amountType;
    private Integer tradeType;
    private Double afterAmt;
    private Integer status;
    private String unitCode;
    private String description;
    private String descriptionEn;
    private String approvedUserId;
    private Date approvedTime;
    private String cancelledUserId;
    private Date cancelledTime;

    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Boolean autoApprove;

    private List<CorCashMoveSource> cashMoveSourceCode;
    private String code;
    private List<String> displayCode;

    private String moneySourceId;

    public List<String> getDisplayCode() {
        return displayCode;
    }

    public void setDisplayCode(List<String> displayCode) {
        this.displayCode = displayCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CorCashMoveSource> getCashMoveSourceCode() {
        return cashMoveSourceCode;
    }

    public void setCashMoveSourceCode(List<CorCashMoveSource> cashMoveSourceCode) {
        this.cashMoveSourceCode = cashMoveSourceCode;
    }

    public Boolean getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(Boolean autoApprove) {
        this.autoApprove = autoApprove;
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

    public String getGroupCd() {
        return groupCd;
    }

    public void setGroupCd(String groupCd) {
        this.groupCd = groupCd;
    }

    public String getTaskCd() {
        return taskCd;
    }

    public void setTaskCd(String taskCd) {
        this.taskCd = taskCd;
    }

    public Integer getGlobalTransId() {
        return globalTransId;
    }

    public void setGlobalTransId(Integer globalTransId) {
        this.globalTransId = globalTransId;
    }

    public Date getSrcDate() {
        return srcDate;
    }

    public void setSrcDate(Date srcDate) {
        this.srcDate = srcDate;
    }

    public Integer getSrcNo() {
        return srcNo;
    }

    public void setSrcNo(Integer srcNo) {
        this.srcNo = srcNo;
    }

    public String getSrcUnitCode() {
        return srcUnitCode;
    }

    public void setSrcUnitCode(String srcUnitCode) {
        this.srcUnitCode = srcUnitCode;
    }

    public Double getBeginAmt() {
        return beginAmt;
    }

    public void setBeginAmt(Double beginAmt) {
        this.beginAmt = beginAmt;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Double getAfterAmt() {
        return afterAmt;
    }

    public void setAfterAmt(Double afterAmt) {
        this.afterAmt = afterAmt;
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

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
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

    public String getMoneySourceId() {
        return moneySourceId;
    }

    public void setMoneySourceId(String moneySourceId) {
        this.moneySourceId = moneySourceId;
    }
}
