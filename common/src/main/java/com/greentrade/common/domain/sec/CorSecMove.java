package com.greentrade.common.domain.sec;

import java.util.Date;

public class CorSecMove {
    private Date AlloDate;
    private Integer RefNo;
    private Date EffectDate;
    private Integer SubAccoCd;
    private Integer SecType;
    private String SecCd;
    private String GroupCd;
    private String TaskCd;
    private Integer GlobalTransId;
    private Date SrcDate;
    private Integer SrcNo;
    private String SrcUnitCode;
    private Double BeginQty;
    private Double Quantity;
    private String QuantityType;
    private Double Price;
    private Integer TradeType;
    private Double AfterQty;
    private Integer Status;
    private String UnitCode;
    private String Description;
    private String DescriptionEn;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String CancelledUserId;
    private Date CancelledTime;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private Boolean autoApprove;

    private Date startDate;
    private Date endDate;
    private String subAccoNo;

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

    public Boolean getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(Boolean autoApprove) {
        this.autoApprove = autoApprove;
    }

    public Date getAlloDate() {
        return AlloDate;
    }

    public void setAlloDate(Date alloDate) {
        AlloDate = alloDate;
    }

    public Integer getRefNo() {
        return RefNo;
    }

    public void setRefNo(Integer refNo) {
        RefNo = refNo;
    }

    public Date getEffectDate() {
        return EffectDate;
    }

    public void setEffectDate(Date effectDate) {
        EffectDate = effectDate;
    }

    public Integer getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public Integer getSecType() {
        return SecType;
    }

    public void setSecType(Integer secType) {
        SecType = secType;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public String getGroupCd() {
        return GroupCd;
    }

    public void setGroupCd(String groupCd) {
        GroupCd = groupCd;
    }

    public String getTaskCd() {
        return TaskCd;
    }

    public void setTaskCd(String taskCd) {
        TaskCd = taskCd;
    }

    public Integer getGlobalTransId() {
        return GlobalTransId;
    }

    public void setGlobalTransId(Integer globalTransId) {
        GlobalTransId = globalTransId;
    }

    public Date getSrcDate() {
        return SrcDate;
    }

    public void setSrcDate(Date srcDate) {
        SrcDate = srcDate;
    }

    public Integer getSrcNo() {
        return SrcNo;
    }

    public void setSrcNo(Integer srcNo) {
        SrcNo = srcNo;
    }

    public String getSrcUnitCode() {
        return SrcUnitCode;
    }

    public void setSrcUnitCode(String srcUnitCode) {
        SrcUnitCode = srcUnitCode;
    }

    public Double getBeginQty() {
        return BeginQty;
    }

    public void setBeginQty(Double beginQty) {
        BeginQty = beginQty;
    }

    public Double getQuantity() {
        return Quantity;
    }

    public void setQuantity(Double quantity) {
        Quantity = quantity;
    }

    public String getQuantityType() {
        return QuantityType;
    }

    public void setQuantityType(String quantityType) {
        QuantityType = quantityType;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getTradeType() {
        return TradeType;
    }

    public void setTradeType(Integer tradeType) {
        TradeType = tradeType;
    }

    public Double getAfterQty() {
        return AfterQty;
    }

    public void setAfterQty(Double afterQty) {
        AfterQty = afterQty;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDescriptionEn() {
        return DescriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        DescriptionEn = descriptionEn;
    }

    public String getApprovedUserId() {
        return ApprovedUserId;
    }

    public void setApprovedUserId(String approvedUserId) {
        ApprovedUserId = approvedUserId;
    }

    public Date getApprovedTime() {
        return ApprovedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        ApprovedTime = approvedTime;
    }

    public String getCancelledUserId() {
        return CancelledUserId;
    }

    public void setCancelledUserId(String cancelledUserId) {
        CancelledUserId = cancelledUserId;
    }

    public Date getCancelledTime() {
        return CancelledTime;
    }

    public void setCancelledTime(Date cancelledTime) {
        CancelledTime = cancelledTime;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getCreatedUserId() {
        return CreatedUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        CreatedUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public String getUpdatedUserId() {
        return UpdatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        UpdatedUserId = updatedUserId;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
