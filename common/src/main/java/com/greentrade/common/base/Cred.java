package com.greentrade.common.base;

import com.greentrade.common.domain.sys.SysMenu;
import com.greentrade.common.domain.sys.SysRole;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Cred implements Serializable{
    private String userId;
    private String branchCode;

    private Date businessDate;

    private List<SysMenu> menulist;

    private List<SysRole> roleList;

    private String language;

    private String ipAddress;
    private String device;
    private String browser;
    private String operator;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<SysMenu> getMenulist() {
        return menulist;
    }

    public void setMenulist(List<SysMenu> menulist) {
        this.menulist = menulist;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }
}
