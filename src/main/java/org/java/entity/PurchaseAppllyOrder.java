package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class PurchaseAppllyOrder  implements Serializable {
    private String purchaseAppllyOrderId;

    private Date purchaseAppllyOrderBegintime;

    private Date purchaseAppllyOrderEndtime;

    private Integer purchaseAppllyUserName;

    private String purchaseAppllyRemark;

    private String processinstanceId;

    public String getPurchaseAppllyOrderId() {
        return purchaseAppllyOrderId;
    }

    public void setPurchaseAppllyOrderId(String purchaseAppllyOrderId) {
        this.purchaseAppllyOrderId = purchaseAppllyOrderId == null ? null : purchaseAppllyOrderId.trim();
    }

    public Date getPurchaseAppllyOrderBegintime() {
        return purchaseAppllyOrderBegintime;
    }

    public void setPurchaseAppllyOrderBegintime(Date purchaseAppllyOrderBegintime) {
        this.purchaseAppllyOrderBegintime = purchaseAppllyOrderBegintime;
    }

    public Date getPurchaseAppllyOrderEndtime() {
        return purchaseAppllyOrderEndtime;
    }

    public void setPurchaseAppllyOrderEndtime(Date purchaseAppllyOrderEndtime) {
        this.purchaseAppllyOrderEndtime = purchaseAppllyOrderEndtime;
    }

    public Integer getPurchaseAppllyUserName() {
        return purchaseAppllyUserName;
    }

    public void setPurchaseAppllyUserName(Integer purchaseAppllyUserName) {
        this.purchaseAppllyUserName = purchaseAppllyUserName;
    }

    public String getPurchaseAppllyRemark() {
        return purchaseAppllyRemark;
    }

    public void setPurchaseAppllyRemark(String purchaseAppllyRemark) {
        this.purchaseAppllyRemark = purchaseAppllyRemark == null ? null : purchaseAppllyRemark.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}