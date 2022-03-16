package com.greentrade.common.domain.sys;

import java.util.List;

public class SysSendRequestChangeStatus {
    private List<SysSendRequest> data;
    private int status;

    public List<SysSendRequest> getData() {
        return data;
    }

    public void setData(List<SysSendRequest> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
