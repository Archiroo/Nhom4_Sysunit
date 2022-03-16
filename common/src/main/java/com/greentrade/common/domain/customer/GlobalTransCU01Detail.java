package com.greentrade.common.domain.customer;

public class GlobalTransCU01Detail {
    private CorCustomer CustomerOld;
    private CorCustomer CustomerPending;

    public CorCustomer getCustomerOld() {
        return CustomerOld;
    }

    public void setCustomerOld(CorCustomer customerOld) {
        CustomerOld = customerOld;
    }

    public CorCustomer getCustomerPending() {
        return CustomerPending;
    }

    public void setCustomerPending(CorCustomer customerPending) {
        CustomerPending = customerPending;
    }
}
