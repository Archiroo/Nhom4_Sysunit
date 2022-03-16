package com.greentrade.common.domain.portfolio;
import java.io.Serializable;
import java.util.Date;

public class PflPortfolioTrans implements Serializable {
    private Date TransDate;
    private int RefNo;
    private int SubAccoCd;
    private String SecCd;
    private int TradeType;
    private Double Quantity;
    private Double Price;
    private Double Amount;
    private Double FeeAmt;
    private Double TaxAmt;
    private String GroupCd;
    private String TaskCd;
    private int GlobalTransId;
    private Date SrcDate;
    private Integer SrcNo;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private String SubAccoNo;
    private Date FromDate;
    private Date ToDate;

    public Date getTransDate() {
        return TransDate;
    }

    public void setTransDate(Date transDate) {
        TransDate = transDate;
    }

    public int getRefNo() {
        return RefNo;
    }

    public void setRefNo(int refNo) {
        RefNo = refNo;
    }

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public Double getQuantity() {
        return Quantity;
    }

    public void setQuantity(Double quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
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

    public int getGlobalTransId() {
        return GlobalTransId;
    }

    public void setGlobalTransId(int globalTransId) {
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

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
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
}
