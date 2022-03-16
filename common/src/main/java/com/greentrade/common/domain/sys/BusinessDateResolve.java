package com.greentrade.common.domain.sys;

import java.util.List;

public class BusinessDateResolve {
    private List<String> branchs;
    private int groupType;
    private List<Integer> actionTypes;

    public List<String> getBranchs() {
        return branchs;
    }

    public void setBranchs(List<String> branchs) {
        this.branchs = branchs;
    }

    public int getGroupType() {
        return groupType;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public List<Integer> getActionTypes() {
        return actionTypes;
    }

    public void setActionTypes(List<Integer> actionTypes) {
        this.actionTypes = actionTypes;
    }
}
