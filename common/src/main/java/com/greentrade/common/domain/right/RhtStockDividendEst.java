package com.greentrade.common.domain.right;

import java.sql.Date;

public class RhtStockDividendEst {
    private Date transDate;
    private Integer id;
    private Integer subAccoCd;
    private Date parentDate;
    private Integer parentNo;
    private String secCd;
    private Double secOwnerQty;
    private Double secOwnerNormalQty;
    private Double secOwnerLimitQty;
    private Double secRecvQty;
    private Double secRecvNormalQty;
    private Double secRecvLimitQty;
    private Double estPrice;
    private Double estValue;
    private Integer status;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    private Integer rightType;
    private String subAccoNo;

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
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

    public Double getSecRecvQty() {
        return secRecvQty;
    }

    public void setSecRecvQty(Double secRecvQty) {
        this.secRecvQty = secRecvQty;
    }

    public Double getSecRecvNormalQty() {
        return secRecvNormalQty;
    }

    public void setSecRecvNormalQty(Double secRecvNormalQty) {
        this.secRecvNormalQty = secRecvNormalQty;
    }

    public Double getSecRecvLimitQty() {
        return secRecvLimitQty;
    }

    public void setSecRecvLimitQty(Double secRecvLimitQty) {
        this.secRecvLimitQty = secRecvLimitQty;
    }

    public Double getEstPrice() {
        return estPrice;
    }

    public void setEstPrice(Double estPrice) {
        this.estPrice = estPrice;
    }

    public Double getEstValue() {
        return estValue;
    }

    public void setEstValue(Double estValue) {
        this.estValue = estValue;
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
}
