package com.greentrade.common.domain.core;
import java.io.Serializable;
import java.util.Date;

public class CorGlobalTrans implements Serializable {
    private Date TransDate;
    private int Id;
    private String GroupCd;
    private String TaskCd;
    private Date SrcDate;
    private int SrcNo;
    private Date EffectDate;
    private Integer SubAccoCd;
    private String SubAccoNo;
    private Integer CustCd;
    private String CustNo;
    private Double Amount;
    private String AmountType;
    private String SecCd;
    private Double Quantity;
    private String QuantityType;
    private String ExtData;
    private Integer Status;
    private Integer Chanel;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String CancelledUserId;
    private Date CancelledTime;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private Date FromDate;
    private Date ToDate;


    public Date getTransDate() {
        return TransDate;
    }

    public void setTransDate(Date transDate) {
        TransDate = transDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public Date getSrcDate() {
        return SrcDate;
    }

    public void setSrcDate(Date srcDate) {
        SrcDate = srcDate;
    }

    public int getSrcNo() {
        return SrcNo;
    }

    public void setSrcNo(int srcNo) {
        SrcNo = srcNo;
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

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public Integer getCustCd() {
        return CustCd;
    }

    public void setCustCd(Integer custCd) {
        CustCd = custCd;
    }

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getAmountType() {
        return AmountType;
    }

    public void setAmountType(String amountType) {
        AmountType = amountType;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
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

    public String getExtData() {
        return ExtData;
    }

    public void setExtData(String extData) {
        ExtData = extData;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public Integer getChanel() {
        return Chanel;
    }

    public void setChanel(Integer chanel) {
        Chanel = chanel;
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

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
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
}

