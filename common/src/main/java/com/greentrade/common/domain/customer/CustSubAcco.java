package com.greentrade.common.domain.customer;

import java.util.Date;

public class CustSubAcco {
    private String SubAccoNo;
    private int SubAccoType;
    private String ProductId;
    private String ProductName;
    private Double MaxLoanAmt;
    private Date CreatedTime;
    private boolean IsDefault;
    private int Status;
    private Date UpdatedTime;

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getMaxLoanAmt() {
        return MaxLoanAmt;
    }

    public void setMaxLoanAmt(Double maxLoanAmt) {
        MaxLoanAmt = maxLoanAmt;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public int getSubAccoType() {
        return SubAccoType;
    }

    public void setSubAccoType(int subAccoType) {
        SubAccoType = subAccoType;
    }

    public boolean getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(boolean isDefault) {
        IsDefault = isDefault;
    }
}
