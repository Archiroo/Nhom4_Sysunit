package com.greentrade.common.domain.cash;
import java.io.Serializable;
import java.util.Date;

public class CorCashTransferLocal implements Serializable {
    private Date AlloDate;
    private int RefNo;
    private Date ExecDate;
    private int FromSubAccoCd;
    private int ToSubAccoCd;
    private Double Amount;
    private int FeeType;
    private Double FeeRate;
    private Double FeeMin;
    private Double FeeAmt;
    private int Status;
    private String Description;
    private String UnitCode;
    private int Channel;
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
    private String AmountType;
    private String FromCustNo;
    private String ToCustNo;

    public Date getAlloDate() {
        return AlloDate;
    }

    public void setAlloDate(Date alloDate) {
        AlloDate = alloDate;
    }

    public int getRefNo() {
        return RefNo;
    }

    public void setRefNo(int refNo) {
        RefNo = refNo;
    }

    public Date getExecDate() {
        return ExecDate;
    }

    public void setExecDate(Date execDate) {
        ExecDate = execDate;
    }

    public int getFromSubAccoCd() {
        return FromSubAccoCd;
    }

    public void setFromSubAccoCd(int fromSubAccoCd) {
        FromSubAccoCd = fromSubAccoCd;
    }

    public int getToSubAccoCd() {
        return ToSubAccoCd;
    }

    public void setToSubAccoCd(int toSubAccoCd) {
        ToSubAccoCd = toSubAccoCd;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public int getFeeType() {
        return FeeType;
    }

    public void setFeeType(int feeType) {
        FeeType = feeType;
    }

    public Double getFeeRate() {
        return FeeRate;
    }

    public void setFeeRate(Double feeRate) {
        FeeRate = feeRate;
    }

    public Double getFeeMin() {
        return FeeMin;
    }

    public void setFeeMin(Double feeMin) {
        FeeMin = feeMin;
    }

    public Double getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        FeeAmt = feeAmt;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
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

    public String getAmountType() {
        return AmountType;
    }

    public void setAmountType(String amountType) {
        AmountType = amountType;
    }

    public String getFromCustNo() {
        return FromCustNo;
    }

    public void setFromCustNo(String fromCustNo) {
        FromCustNo = fromCustNo;
    }

    public String getToCustNo() {
        return ToCustNo;
    }

    public void setToCustNo(String toCustNo) {
        ToCustNo = toCustNo;
    }
}