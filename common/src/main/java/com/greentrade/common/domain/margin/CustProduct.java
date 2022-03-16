package com.greentrade.common.domain.margin;

import java.util.Date;

public class CustProduct {
    private String Code;
    private int Type;
    private String Name;
    private Double InterRate; //Lãi suất
    private Double MinDepositRate;
    private Date FromDate;//từ ngày
    private Date ToDate;//đến ngày
    private Double WarningRate;
    private Double CallRate;
    private int LoanDays;//số ngày cho vay
    private Double OverRate;
    private int FreeDays; //số ngày miễn lãi
    private Double MinInteresAmt; //lãi tối thiểu

    private Double FeeRate;
    private Double MaxLoanAmt;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getInterRate() {
        return InterRate;
    }

    public void setInterRate(Double interRate) {
        InterRate = interRate;
    }

    public Double getMinDepositRate() {
        return MinDepositRate;
    }

    public void setMinDepositRate(Double minDepositRate) {
        MinDepositRate = minDepositRate;
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

    public Double getWarningRate() {
        return WarningRate;
    }

    public void setWarningRate(Double warningRate) {
        WarningRate = warningRate;
    }

    public Double getCallRate() {
        return CallRate;
    }

    public void setCallRate(Double callRate) {
        CallRate = callRate;
    }

    public int getLoanDays() {
        return LoanDays;
    }

    public void setLoanDays(int loanDays) {
        LoanDays = loanDays;
    }

    public Double getOverRate() {
        return OverRate;
    }

    public void setOverRate(Double overRate) {
        OverRate = overRate;
    }

    public int getFreeDays() {
        return FreeDays;
    }

    public void setFreeDays(int freeDays) {
        FreeDays = freeDays;
    }

    public Double getMinInteresAmt() {
        return MinInteresAmt;
    }

    public void setMinInteresAmt(Double minInteresAmt) {
        MinInteresAmt = minInteresAmt;
    }

    public Double getFeeRate() {
        return FeeRate;
    }

    public void setFeeRate(Double feeRate) {
        FeeRate = feeRate;
    }

    public Double getMaxLoanAmt() {
        return MaxLoanAmt;
    }

    public void setMaxLoanAmt(Double maxLoanAmt) {
        MaxLoanAmt = maxLoanAmt;
    }
}
