package com.greentrade.common.domain.order;

import java.util.List;

public class MergeOrderStruct {
    List<OrdOrder> OrdOrderList;
    OrderMappingInfo MappingInfo;

    public List<OrdOrder> getOrdOrderList() {
        return OrdOrderList;
    }

    public void setOrdOrderList(List<OrdOrder> ordOrderList) {
        OrdOrderList = ordOrderList;
    }

    public OrderMappingInfo getMappingInfo() {
        return MappingInfo;
    }

    public void setMappingInfo(OrderMappingInfo mappingInfo) {
        MappingInfo = mappingInfo;
    }
}
