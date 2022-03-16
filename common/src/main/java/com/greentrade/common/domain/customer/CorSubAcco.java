package com.greentrade.common.domain.customer;
import java.io.Serializable;
import java.util.Date;

public class CorSubAcco implements Serializable {
    private int SubAccoCd;
    private int CustCd;
    private String SubAccoNo;
    private int SubAccoType = -1;
    private String ProductId;
    private Double MaxLoanAmt;
    private String ContractNo;
    private Date OpenDate;
    private Date CloseDate;
    private Date ReopenDate;
    private int Status;
    private boolean IsDefault;
    private int Channel;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;
    private String CustNo;

    private Date FromDate;
    private Date ToDate;

    private Date ProductFromDate;
    private Date ProductToDate;

    private String ProductName;

    private boolean NotUpdateProductLimit;

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

    public Date getOpenDate() {
        return OpenDate;
    }

    public void setOpenDate(Date openDate) {
        OpenDate = openDate;
    }

    public Date getCloseDate() {
        return CloseDate;
    }

    public void setCloseDate(Date closeDate) {
        CloseDate = closeDate;
    }

    public Date getReopenDate() {
        return ReopenDate;
    }

    public void setReopenDate(Date reopenDate) {
        ReopenDate = reopenDate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
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

    public boolean isDefault() {
        return IsDefault;
    }

    public void setDefault(boolean aDefault) {
        IsDefault = aDefault;
    }

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
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

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Date getProductFromDate() {
        return ProductFromDate;
    }

    public void setProductFromDate(Date productFromDate) {
        ProductFromDate = productFromDate;
    }

    public Date getProductToDate() {
        return ProductToDate;
    }

    public void setProductToDate(Date productToDate) {
        ProductToDate = productToDate;
    }

    public boolean isNotUpdateProductLimit() {
        return NotUpdateProductLimit;
    }

    public void setNotUpdateProductLimit(boolean notUpdateProductLimit) {
        NotUpdateProductLimit = notUpdateProductLimit;
    }
}
