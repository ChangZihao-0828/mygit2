package org.java.entity;

import java.io.Serializable;

public class SysPurchaseAppllyMatter  implements Serializable {
    private Integer sysPurchaseAppllyMatterId;

    private String purchaseAppllyOrderId;

    private String matterId;

    public Integer getSysPurchaseAppllyMatterId() {
        return sysPurchaseAppllyMatterId;
    }

    public void setSysPurchaseAppllyMatterId(Integer sysPurchaseAppllyMatterId) {
        this.sysPurchaseAppllyMatterId = sysPurchaseAppllyMatterId;
    }

    public String getPurchaseAppllyOrderId() {
        return purchaseAppllyOrderId;
    }

    public void setPurchaseAppllyOrderId(String purchaseAppllyOrderId) {
        this.purchaseAppllyOrderId = purchaseAppllyOrderId == null ? null : purchaseAppllyOrderId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }
}