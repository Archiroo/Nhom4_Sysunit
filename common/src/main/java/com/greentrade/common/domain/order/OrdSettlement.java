package com.greentrade.common.domain.order;
import java.io.Serializable;
import java.util.Date;

public class OrdSettlement implements Serializable {
    private Date AlloDate;
    private int RefNo;
    private Date TradeDate;
    private int OrderId;
    private int MatchId;
    private int SubAccoCd;
    private String SubAccoNo;
    private int CustCd;
    private String CustNo;
    private String CustName;
    private String CustUnitCode;
    private int TradeType;
    private String SecCd;
    private int SecType;
    private Double MatQty;
    private Double MatAmt;
    private Double MatPrice;
    private Double FeeAmt;
    private Double TaxAmt;
    private Double LoanAmt;
    private Double InterestAmt;
    private Double DepositAmt;
    private Date CashPaymentDate;
    private Date SecPaymentDate;
    private int DayId;
    private int PaymentStatus;
    private int Status;
    private Boolean IsFinished;
    private String ApprovedUserId;
    private Date ApprovedTime;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private int DateType;
    private String BranchCode;
    private String BranchName;

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

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        MatchId = matchId;
    }

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public int getCustCd() {
        return CustCd;
    }

    public void setCustCd(int custCd) {
        CustCd = custCd;
    }

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustUnitCode() {
        return CustUnitCode;
    }

    public void setCustUnitCode(String custUnitCode) {
        CustUnitCode = custUnitCode;
    }

    public int getTradeType() {
        return TradeType;
    }

    public void setTradeType(int tradeType) {
        TradeType = tradeType;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public int getSecType() {
        return SecType;
    }

    public void setSecType(int secType) {
        SecType = secType;
    }

    public Double getMatQty() {
        return MatQty;
    }

    public void setMatQty(Double matQty) {
        MatQty = matQty;
    }

    public Double getMatAmt() {
        return MatAmt;
    }

    public void setMatAmt(Double matAmt) {
        MatAmt = matAmt;
    }

    public Double getMatPrice() {
        return MatPrice;
    }

    public void setMatPrice(Double matPrice) {
        MatPrice = matPrice;
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

    public Double getLoanAmt() {
        return LoanAmt;
    }

    public void setLoanAmt(Double loanAmt) {
        LoanAmt = loanAmt;
    }

    public Double getInterestAmt() {
        return InterestAmt;
    }

    public void setInterestAmt(Double interestAmt) {
        InterestAmt = interestAmt;
    }

    public Double getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(Double depositAmt) {
        DepositAmt = depositAmt;
    }

    public Date getCashPaymentDate() {
        return CashPaymentDate;
    }

    public void setCashPaymentDate(Date cashPaymentDate) {
        CashPaymentDate = cashPaymentDate;
    }

    public Date getSecPaymentDate() {
        return SecPaymentDate;
    }

    public void setSecPaymentDate(Date secPaymentDate) {
        SecPaymentDate = secPaymentDate;
    }

    public int getDayId() {
        return DayId;
    }

    public void setDayId(int dayId) {
        DayId = dayId;
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

    public Boolean getIsFinished() {
        return IsFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        IsFinished = isFinished;
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

    public int getDateType() {
        return DateType;
    }

    public void setDateType(int dateType) {
        DateType = dateType;
    }

    public Boolean getFinished() {
        return IsFinished;
    }

    public void setFinished(Boolean finished) {
        IsFinished = finished;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String branchCode) {
        BranchCode = branchCode;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }
}