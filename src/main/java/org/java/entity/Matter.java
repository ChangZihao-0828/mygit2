package org.java.entity;

import java.io.Serializable;

public class Matter   implements Serializable {
    private String matterId;

    private String matterName;

    private Integer matterWeight;

    private String matterUnit;

    private String matterSpec;

    private String matterBulk;

    private Integer matterStock;

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName == null ? null : matterName.trim();
    }

    public Integer getMatterWeight() {
        return matterWeight;
    }

    public void setMatterWeight(Integer matterWeight) {
        this.matterWeight = matterWeight;
    }

    public String getMatterUnit() {
        return matterUnit;
    }

    public void setMatterUnit(String matterUnit) {
        this.matterUnit = matterUnit == null ? null : matterUnit.trim();
    }

    public String getMatterSpec() {
        return matterSpec;
    }

    public void setMatterSpec(String matterSpec) {
        this.matterSpec = matterSpec == null ? null : matterSpec.trim();
    }

    public String getMatterBulk() {
        return matterBulk;
    }

    public void setMatterBulk(String matterBulk) {
        this.matterBulk = matterBulk == null ? null : matterBulk.trim();
    }

    public Integer getMatterStock() {
        return matterStock;
    }

    public void setMatterStock(Integer matterStock) {
        this.matterStock = matterStock;
    }
}