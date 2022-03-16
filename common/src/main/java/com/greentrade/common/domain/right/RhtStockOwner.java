package com.greentrade.common.domain.right;

import java.util.Date;

public class RhtStockOwner {
    private Integer id;
    private Integer subAccoCd;
    private Date parentDate;
    private Integer parentNo;
    private String secCd;
    private Double secOwnerQty;
    private Double secOwnerNormalQty;
    private Double secOwnerLimitQty;

    private Integer compareStatus;
    private Integer status;
    private String remarks;
    private String approvedUserId;
    private Date approvedTime;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Date startDate;
    private Date endDate;
    private Integer rightType;
    private String subAccoNo;
    private Date ownerFixDate;

    public Double getSecOwnerNormalQty() {
        return secOwnerNormalQty;
    }

    public void setSecOwnerNormalQty(Double secOwnerNormalQty) {
        this.secOwnerNormalQty = secOwnerNormalQty;
    }

    public Double getSecOwnerLimitQty() {
        return secOwnerLimitQty;
    }

    public void setSecOwnerLimitQty(Double secOwnerLimitQty) {
        this.secOwnerLimitQty = secOwnerLimitQty;
    }

    public Integer getCompareStatus() {
        return compareStatus;
    }

    public void setCompareStatus(Integer compareStatus) {
        this.compareStatus = compareStatus;
    }

    public Date getOwnerFixDate() {
        return ownerFixDate;
    }

    public void setOwnerFixDate(Date ownerFixDate) {
        this.ownerFixDate = ownerFixDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }

    public String getSubAccoNo() {
        return subAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        this.subAccoNo = subAccoNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubAccoCd() {
        return subAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        this.subAccoCd = subAccoCd;
    }

    public Date getParentDate() {
        return parentDate;
    }

    public void setParentDate(Date parentDate) {
        this.parentDate = parentDate;
    }

    public Integer getParentNo() {
        return parentNo;
    }

    public void setParentNo(Integer parentNo) {
        this.parentNo = parentNo;
    }

    public String getSecCd() {
        return secCd;
    }

    public void setSecCd(String secCd) {
        this.secCd = secCd;
    }

    public Double getSecOwnerQty() {
        return secOwnerQty;
    }

    public void setSecOwnerQty(Double secOwnerQty) {
        this.secOwnerQty = secOwnerQty;
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

    public String getApprovedUserId() {
        return approvedUserId;
    }

    public void setApprovedUserId(String approvedUserId) {
        this.approvedUserId = approvedUserId;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
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
}
