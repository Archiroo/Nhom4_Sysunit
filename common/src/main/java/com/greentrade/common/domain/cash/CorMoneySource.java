package com.greentrade.common.domain.cash;

import java.io.Serializable;
import java.util.Date;

public class CorMoneySource implements Serializable {

    private Integer id;
    private String code;
    private String name;
    private String bankAccoNo;
    private String bankAccoName;
    private String bankCode;
    private String bankBranchCode;
    private String bankBranchSName;
    private String bankSName;
    private String remarks;
    private String createdUserId;
    private Date createdTime;
    private String updatedUserId;
    private Date updatedTime;

    public String getBankBranchSName() {
        return bankBranchSName;
    }

    public void setBankBranchSName(String bankBranchSName) {
        this.bankBranchSName = bankBranchSName;
    }

    public String getBankSName() {
        return bankSName;
    }

    public void setBankSName(String bankSName) {
        this.bankSName = bankSName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getBankAccoNo() {
        return bankAccoNo;
    }

    public void setBankAccoNo(String bankAccoNo) {
        this.bankAccoNo = bankAccoNo;
    }

    public String getBankAccoName() {
        return bankAccoName;
    }

    public void setBankAccoName(String bankAccoName) {
        this.bankAccoName = bankAccoName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankBranchCode() {
        return bankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
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
}
