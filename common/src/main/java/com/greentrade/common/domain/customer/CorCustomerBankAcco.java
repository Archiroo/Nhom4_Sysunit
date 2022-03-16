package com.greentrade.common.domain.customer;
import java.io.Serializable;
import java.util.Date;

public class CorCustomerBankAcco implements Serializable {
    private int Id;
    private int CustCd;
    private String BankAccoNo;
    private String BankAccoName;
    private String BankCode;
    private String BankBranchCode;
    private int Status;
    private String Remarks;
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

    public int getCustCd() {
        return CustCd;
    }

    public void setCustCd(int custCd) {
        CustCd = custCd;
    }

    public String getBankAccoNo() {
        return BankAccoNo;
    }

    public void setBankAccoNo(String bankAccoNo) {
        BankAccoNo = bankAccoNo;
    }

    public String getBankAccoName() {
        return BankAccoName;
    }

    public void setBankAccoName(String bankAccoName) {
        BankAccoName = bankAccoName;
    }

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    public String getBankBranchCode() {
        return BankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        BankBranchCode = bankBranchCode;
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
