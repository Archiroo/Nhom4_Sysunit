package com.greentrade.common.domain.sys;

import java.util.List;

public class SysCustNoticeChangeStatus {
    private List<SysCustNotice> data;
    private int status;

    public List<SysCustNotice> getData() {
        return data;
    }

    public void setData(List<SysCustNotice> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
