package com.greentrade.common.domain.margin;

import java.io.Serializable;
import java.util.Date;

public class MrgProduct implements Serializable {
    private String code;

    private String name;

    private Integer type;

    private Date fromDate;

    private Date toDate;

    private Double warningRate;
    private Double callRate;
    private Double rttWarningRate;
    private Double rttCallRate;
    private Double derDepositRate;
    private Double derLoanRate;
    private Double derFeeAmt;

    private Integer loanDays;

    private Double interRate;
    private Double overRate;

    private Integer freeDays;
    private Double minInteresAmt;
    private Double maxLoanAmt;
    private int status;

    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Double getWarningRate() {
        return warningRate;
    }

    public void setWarningRate(Double warningRate) {
        this.warningRate = warningRate;
    }

    public Double getCallRate() {
        return callRate;
    }

    public void setCallRate(Double callRate) {
        this.callRate = callRate;
    }

    public Double getRttWarningRate() {
        return rttWarningRate;
    }

    public void setRttWarningRate(Double rttWarningRate) {
        this.rttWarningRate = rttWarningRate;
    }

    public Double getRttCallRate() {
        return rttCallRate;
    }

    public void setRttCallRate(Double rttCallRate) {
        this.rttCallRate = rttCallRate;
    }

    public Double getDerDepositRate() {
        return derDepositRate;
    }

    public void setDerDepositRate(Double derDepositRate) {
        this.derDepositRate = derDepositRate;
    }

    public Double getDerLoanRate() {
        return derLoanRate;
    }

    public void setDerLoanRate(Double derLoanRate) {
        this.derLoanRate = derLoanRate;
    }

    public Double getDerFeeAmt() {
        return derFeeAmt;
    }

    public void setDerFeeAmt(Double derFeeAmt) {
        this.derFeeAmt = derFeeAmt;
    }

    public Integer getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
    }

    public Double getInterRate() {
        return interRate;
    }

    public void setInterRate(Double interRate) {
        this.interRate = interRate;
    }

    public Double getOverRate() {
        return overRate;
    }

    public void setOverRate(Double overRate) {
        this.overRate = overRate;
    }

    public Integer getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }

    public Double getMinInteresAmt() {
        return minInteresAmt;
    }

    public void setMinInteresAmt(Double minInteresAmt) {
        this.minInteresAmt = minInteresAmt;
    }

    public Double getMaxLoanAmt() {
        return maxLoanAmt;
    }

    public void setMaxLoanAmt(Double maxLoanAmt) {
        this.maxLoanAmt = maxLoanAmt;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
