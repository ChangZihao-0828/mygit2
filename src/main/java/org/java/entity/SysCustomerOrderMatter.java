package org.java.entity;

import java.io.Serializable;

public class SysCustomerOrderMatter  implements Serializable {
    private Integer sysCustomerMatterId;

    private String customerOrderId;

    private String matterId;

    private Integer sysAmount;

    public Integer getSysCustomerMatterId() {
        return sysCustomerMatterId;
    }

    public void setSysCustomerMatterId(Integer sysCustomerMatterId) {
        this.sysCustomerMatterId = sysCustomerMatterId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public Integer getSysAmount() {
        return sysAmount;
    }

    public void setSysAmount(Integer sysAmount) {
        this.sysAmount = sysAmount;
    }
}