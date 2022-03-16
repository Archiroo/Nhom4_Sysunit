package com.greentrade.common.domain.customer;
import java.io.Serializable;
import java.util.Date;

public class CorFrontUser implements Serializable
{
    private int id;
    private int custCd;
    private String userName;
    private String password;
    private String pinCode;
    private String passDirect;
    private String mobileNo;
    private String email;
    private boolean isConfirmEmail;
    private int authenType;
    private int status;
    private boolean active;
    private boolean activeTrading;
    private boolean needChangePass;
    private boolean needChangePin;
    private Date openDate;
    private Date closeDate;
    private Date lastAccessTime;
    private String lastAccessClientInfo;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private String custName;
    private String CustNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustCd() {
        return custCd;
    }

    public void setCustCd(int custCd) {
        this.custCd = custCd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassDirect() {
        return passDirect;
    }

    public void setPassDirect(String passDirect) {
        this.passDirect = passDirect;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsConfirmEmail() {
        return isConfirmEmail;
    }

    public void setIsConfirmEmail(boolean isConfirmEmail) {
        this.isConfirmEmail = isConfirmEmail;
    }

    public int getAuthenType() {
        return authenType;
    }

    public void setAuthenType(int authenType) {
        this.authenType = authenType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActiveTrading() {
        return activeTrading;
    }

    public void setActiveTrading(boolean activeTrading) {
        this.activeTrading = activeTrading;
    }

    public boolean isNeedChangePass() {
        return needChangePass;
    }

    public void setNeedChangePass(boolean needChangePass) {
        this.needChangePass = needChangePass;
    }

    public boolean isNeedChangePin() {
        return needChangePin;
    }

    public void setNeedChangePin(boolean needChangePin) {
        this.needChangePin = needChangePin;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getLastAccessClientInfo() {
        return lastAccessClientInfo;
    }

    public void setLastAccessClientInfo(String lastAccessClientInfo) {
        this.lastAccessClientInfo = lastAccessClientInfo;
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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNo() {
        return CustNo;
    }

    public void setCustNo(String custNo) {
        CustNo = custNo;
    }
}