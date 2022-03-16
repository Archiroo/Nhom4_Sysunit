package com.greentrade.common.domain.right;

import java.io.Serializable;
import java.util.Date;

public class RhtCapitalIncreaseRegister implements Serializable {
    private int Id;
    private int SubAccoCd;
    private Date ParentDate;
    private int ParentNo;
    private String SecCd;
    private int ActionType;
    private Date ApplyDate;
    private Double ApplyQty;
    private Double Amount;
    private int Channel;
    private int Status;
    private String Remarks;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private String SubAccoNo;
    private Date OwnerFixDate;
    private Date StartDate;
    private Date EndDate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public Date getParentDate() {
        return ParentDate;
    }

    public void setParentDate(Date parentDate) {
        ParentDate = parentDate;
    }

    public int getParentNo() {
        return ParentNo;
    }

    public void setParentNo(int parentNo) {
        ParentNo = parentNo;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public int getActionType() {
        return ActionType;
    }

    public void setActionType(int actionType) {
        ActionType = actionType;
    }

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date applyDate) {
        ApplyDate = applyDate;
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

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
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

    public Date getOwnerFixDate() {
        return OwnerFixDate;
    }

    public void setOwnerFixDate(Date ownerFixDate) {
        OwnerFixDate = ownerFixDate;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
    }
}