package com.greentrade.common.domain.sys;

public class SysBusinessDateChecked {
    private String Description;
    private String ProcedureName;
    private int Count;
    private int Level;

    public String getProcedureName() {
        return ProcedureName;
    }

    public void setProcedureName(String procedureName) {
        ProcedureName = procedureName;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
