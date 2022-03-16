package com.greentrade.common.domain.customer;

import java.util.Date;
import java.util.List;

public class CustCustomerInfoInit {
    private Date BusinessDate;
    private Date ServerDateTime;
    private CustFrontUser FrontUserInit;
    private CustCustomer CustomerInit;
    private List<CustSubAcco> SubAccoList;

    public Date getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(Date businessDate) {
        BusinessDate = businessDate;
    }

    public Date getServerDateTime() {
        return ServerDateTime;
    }

    public void setServerDateTime(Date serverDateTime) {
        ServerDateTime = serverDateTime;
    }

    public CustFrontUser getFrontUserInit() {
        return FrontUserInit;
    }

    public void setFrontUserInit(CustFrontUser frontUserInit) {
        FrontUserInit = frontUserInit;
    }

    public CustCustomer getCustomerInit() {
        return CustomerInit;
    }

    public void setCustomerInit(CustCustomer customerInit) {
        CustomerInit = customerInit;
    }

    public List<CustSubAcco> getSubAccoList() {
        return SubAccoList;
    }

    public void setSubAccoList(List<CustSubAcco> subAccoList) {
        SubAccoList = subAccoList;
    }
}
