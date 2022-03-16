package com.greentrade.common.domain.customer;

import java.util.Date;

public class CorSubAccoPending {
    private int Id;
    private int SubAccoCd;
    private int CustCd;
    private String SubAccoNo;
    private int SubAccoType = -1;
    private String ProductId;
    private Double MaxLoanAmt;
    private String ContractNo;
    private boolean NotUpdateProductLimit;
    private int PendingStatus;
    private boolean IsDefault;
    private int Channel;
    private String Remarks;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private String CustNo;

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

    public int getCustCd() {
        return CustCd;
    }

    public void setCustCd(int custCd) {
        CustCd = custCd;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public int getSubAccoType() {
        return SubAccoType;
    }

    public void setSubAccoType(int subAccoType) {
        SubAccoType = subAccoType;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public Double getMaxLoanAmt() {
        return MaxLoanAmt;
    }

    public void setMaxLoanAmt(Double maxLoanAmt) {
        MaxLoanAmt = maxLoanAmt;
    }

    public String getContractNo() {
        return ContractNo;
    }

    public void setContractNo(String contractNo) {
        ContractNo = contractNo;
    }

    public boolean isNotUpdateProductLimit() {
        return NotUpdateProductLimit;
    }

    public void setNotUpdateProductLimit(boolean notUpdateProductLimit) {
        NotUpdateProductLimit = notUpdateProductLimit;
    }

    public int getPendingStatus() {
        return PendingStatus;
    }

    public void setPendingStatus(int pendingStatus) {
        PendingStatus = pendingStatus;
    }

    public boolean getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(boolean isDefault) {
        IsDefault = isDefault;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
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

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
    }
}
