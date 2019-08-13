package org.java.entity;

import java.io.Serializable;

public class WarehouserType implements Serializable {
    private Integer warehouserTypeId;

    private String warehousertypeState;

    public Integer getWarehouserTypeId() {
        return warehouserTypeId;
    }

    public void setWarehouserTypeId(Integer warehouserTypeId) {
        this.warehouserTypeId = warehouserTypeId;
    }

    public String getWarehousertypeState() {
        return warehousertypeState;
    }

    public void setWarehousertypeState(String warehousertypeState) {
        this.warehousertypeState = warehousertypeState == null ? null : warehousertypeState.trim();
    }
}