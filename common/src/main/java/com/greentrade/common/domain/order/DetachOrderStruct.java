package com.greentrade.common.domain.order;

import java.util.List;

public class DetachOrderStruct {
    List<OrderMappingInfo> MappingInfoList;
    OrdOrder ordOrder;

    public List<OrderMappingInfo> getMappingInfoList() {
        return MappingInfoList;
    }

    public void setMappingInfoList(List<OrderMappingInfo> mappingInfoList) {
        MappingInfoList = mappingInfoList;
    }

    public OrdOrder getOrdOrder() {
        return ordOrder;
    }

    public void setOrdOrder(OrdOrder ordOrder) {
        this.ordOrder = ordOrder;
    }
}
