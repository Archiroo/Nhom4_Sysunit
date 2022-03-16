package com.greentrade.common.domain.right;

import java.io.Serializable;
import java.util.Date;

public class RhtCapitalIncrease implements Serializable {
    private int Id;
    private int SubAccoCd;
    private Date ParentDate;
    private int ParentNo;
    private String SecCd;
    private Date EntryDate;
    private Double SecOwnerQty;
    private Double RightOwnerQty;
    private Double AvailRegisterQty;
    private Double RegisteredQty;
    private Double TotalAmount;
    private Date PaymentDate;
    private Date PaymentTradeDate;
    private int PaymentStatus;
    private int Status;
    private String Remarks;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private Date OwnerFixDate;
    private Date RightExecDate;
    private String subAccoNo;
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

    public Date getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Date entryDate) {
        EntryDate = entryDate;
    }

    public Double getSecOwnerQty() {
        return SecOwnerQty;
    }

    public void setSecOwnerQty(Double secOwnerQty) {
        SecOwnerQty = secOwnerQty;
    }

    public Double getRightOwnerQty() {
        return RightOwnerQty;
    }

    public void setRightOwnerQty(Double rightOwnerQty) {
        RightOwnerQty = rightOwnerQty;
    }

    public Double getAvailRegisterQty() {
        return AvailRegisterQty;
    }

    public void setAvailRegisterQty(Double availRegisterQty) {
        AvailRegisterQty = availRegisterQty;
    }

    public Double getRegisteredQty() {
        return RegisteredQty;
    }

    public void setRegisteredQty(Double registeredQty) {
        RegisteredQty = registeredQty;
    }

    public Double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        TotalAmount = totalAmount;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        PaymentDate = paymentDate;
    }

    public Date getPaymentTradeDate() {
        return PaymentTradeDate;
    }

    public void setPaymentTradeDate(Date paymentTradeDate) {
        PaymentTradeDate = paymentTradeDate;
    }

    public int getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        PaymentStatus = paymentStatus;
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

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
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

    public Date getRightExecDate() {
        return RightExecDate;
    }

    public void setRightExecDate(Date rightExecDate) {
        RightExecDate = rightExecDate;
    }
}