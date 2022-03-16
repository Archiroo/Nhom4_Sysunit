package com.greentrade.common.domain.customer;

import java.util.Date;

public class CustCustomer {
    private String CustName;
    private Date Dob;
    private Integer Gender;
    private String Email;
    private String MobileNo;
    private Integer CardType;
    private String IdCardNo;
    private String IdCardIssuer;
    private Date IdCardIssueDate;
    private Date IdCardExpireDate;
    private String Address;
    private String FrontCardLink;
    private String BackCardLink;
    private int Status;
    private Date UpdatedTime;

    private boolean IsUpdatePending;

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public Integer getCardType() {
        return CardType;
    }

    public void setCardType(Integer cardType) {
        CardType = cardType;
    }

    public String getIdCardNo() {
        return IdCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        IdCardNo = idCardNo;
    }

    public String getIdCardIssuer() {
        return IdCardIssuer;
    }

    public void setIdCardIssuer(String idCardIssuer) {
        IdCardIssuer = idCardIssuer;
    }

    public Date getIdCardIssueDate() {
        return IdCardIssueDate;
    }

    public void setIdCardIssueDate(Date idCardIssueDate) {
        IdCardIssueDate = idCardIssueDate;
    }

    public Date getIdCardExpireDate() {
        return IdCardExpireDate;
    }

    public void setIdCardExpireDate(Date idCardExpireDate) {
        IdCardExpireDate = idCardExpireDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFrontCardLink() {
        return FrontCardLink;
    }

    public void setFrontCardLink(String frontCardLink) {
        FrontCardLink = frontCardLink;
    }

    public String getBackCardLink() {
        return BackCardLink;
    }

    public void setBackCardLink(String backCardLink) {
        BackCardLink = backCardLink;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public boolean getIsUpdatePending() {
        return IsUpdatePending;
    }

    public void setIsUpdatePending(boolean isUpdatePending) {
        IsUpdatePending = isUpdatePending;
    }
}
