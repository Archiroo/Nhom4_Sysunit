package com.greentrade.common.domain.margin;

import java.io.Serializable;
import java.util.Date;

public class MrgProductSec implements Serializable {
    private String id;

    private String productCode;
    private String productName;
    private String secCd;

    private Date fromDate;

    private Date toDate;

    private Double depositRate;
    private Double loanRate;
    private Double dividendEstRate;
    private Double maxPrice;
    private Integer status;

    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Double interRate;
    private Double overRate;
    private boolean notUpdateByProduct;
    private Double maxRoom;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
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

    public Double getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    public Double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Double loanRate) {
        this.loanRate = loanRate;
    }

    public Double getDividendEstRate() {
        return dividendEstRate;
    }

    public void setDividendEstRate(Double dividendEstRate) {
        this.dividendEstRate = dividendEstRate;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public boolean getNotUpdateByProduct() {
        return notUpdateByProduct;
    }

    public void setNotUpdateByProduct(boolean notUpdateByProduct) {
        this.notUpdateByProduct = notUpdateByProduct;
    }

    public Double getMaxRoom() {
        return maxRoom;
    }

    public void setMaxRoom(Double maxRoom) {
        this.maxRoom = maxRoom;
    }
}
