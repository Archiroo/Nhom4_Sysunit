package com.greentrade.common.domain.customer;
import java.io.Serializable;
import java.util.Date;

public class CorCustomer implements Serializable {
    private int CustCd;
    private String CustNo;
    private String CustName;
    private int CustNoType;
    private String UnitCode;
    private Integer CustType;
    private Integer ForeignType;
    private String CountryCd;
    private String Address;
    private Date Dob;
    private Integer Gender;
    private String MobileNo;
    private String Email;
    private Integer CardType;
    private String IdCardNo;
    private String IdCardIssuer;
    private Date IdCardIssueDate;
    private Date IdCardExpireDate;
    private String ContractNo;
    private Date OpenDate;
    private Date CloseDate;
    private int CurrentStep;
    private int CompleteStatus;
    private Date ExpiredDate;
    private int Status;
    private int Channel;
    private Integer IntroCustCd;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    private Double amtDepositCurrent;
    private Double amtDepositAvail;
    private Double amtWitdrawAvail;
    private Double transferAvailAmt ;

    private String Password;
    private String PinCode;
    private String IntroCustNo;
    private Boolean NeedChangePass;

    private String LinkIdCardFront;
    private String LinkIdCardBack;

    private String PassDirect;

    private boolean IsUpdatePending;

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

    public int getCustNoType() {
        return CustNoType;
    }

    public void setCustNoType(int custNoType) {
        CustNoType = custNoType;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public Integer getCustType() {
        return CustType;
    }

    public void setCustType(Integer custType) {
        CustType = custType;
    }

    public Integer getForeignType() {
        return ForeignType;
    }

    public void setForeignType(Integer foreignType) {
        ForeignType = foreignType;
    }

    public String getCountryCd() {
        return CountryCd;
    }

    public void setCountryCd(String countryCd) {
        CountryCd = countryCd;
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

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
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

    public int getCurrentStep() {
        return CurrentStep;
    }

    public void setCurrentStep(int currentStep) {
        CurrentStep = currentStep;
    }

    public int getCompleteStatus() {
        return CompleteStatus;
    }

    public void setCompleteStatus(int completeStatus) {
        CompleteStatus = completeStatus;
    }

    public Date getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        ExpiredDate = expiredDate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
    }

    public Integer getIntroCustCd() {
        return IntroCustCd;
    }

    public void setIntroCustCd(Integer introCustCd) {
        IntroCustCd = introCustCd;
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

    public Double getAmtDepositCurrent() {
        return amtDepositCurrent;
    }

    public void setAmtDepositCurrent(Double amtDepositCurrent) {
        this.amtDepositCurrent = amtDepositCurrent;
    }

    public Double getAmtDepositAvail() {
        return amtDepositAvail;
    }

    public void setAmtDepositAvail(Double amtDepositAvail) {
        this.amtDepositAvail = amtDepositAvail;
    }

    public Double getAmtWitdrawAvail() {
        return amtWitdrawAvail;
    }

    public void setAmtWitdrawAvail(Double amtWitdrawAvail) {
        this.amtWitdrawAvail = amtWitdrawAvail;
    }

    public Double getTransferAvailAmt() {
        return transferAvailAmt;
    }

    public void setTransferAvailAmt(Double transferAvailAmt) {
        this.transferAvailAmt = transferAvailAmt;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getIntroCustNo() {
        return IntroCustNo;
    }

    public void setIntroCustNo(String introCustNo) {
        IntroCustNo = introCustNo;
    }

    public Boolean getNeedChangePass() {
        return NeedChangePass;
    }

    public void setNeedChangePass(Boolean needChangePass) {
        NeedChangePass = needChangePass;
    }

    public String getLinkIdCardFront() {
        return LinkIdCardFront;
    }

    public void setLinkIdCardFront(String linkIdCardFront) {
        LinkIdCardFront = linkIdCardFront;
    }

    public String getLinkIdCardBack() {
        return LinkIdCardBack;
    }

    public void setLinkIdCardBack(String linkIdCardBack) {
        LinkIdCardBack = linkIdCardBack;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassDirect() {
        return PassDirect;
    }

    public void setPassDirect(String passDirect) {
        PassDirect = passDirect;
    }

    public boolean getIsUpdatePending() {
        return IsUpdatePending;
    }

    public void setIsUpdatePending(boolean isUpdatePending) {
        IsUpdatePending = isUpdatePending;
    }
}
