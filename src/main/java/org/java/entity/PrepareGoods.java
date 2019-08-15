package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class PrepareGoods  implements Serializable {
    private String prepareGoodsId;

    private String purchaseOrderId;

    private Date prepareGoodsTime;

    private String prepareGoodsUserId;

    private String prepareGoodsStatus;

    private String processinstanceId;

    public String getPrepareGoodsId() {
        return prepareGoodsId;
    }

    public void setPrepareGoodsId(String prepareGoodsId) {
        this.prepareGoodsId = prepareGoodsId == null ? null : prepareGoodsId.trim();
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId == null ? null : purchaseOrderId.trim();
    }

    public Date getPrepareGoodsTime() {
        return prepareGoodsTime;
    }

    public void setPrepareGoodsTime(Date prepareGoodsTime) {
        this.prepareGoodsTime = prepareGoodsTime;
    }

    public String getPrepareGoodsUserId() {
        return prepareGoodsUserId;
    }

    public void setPrepareGoodsUserId(String prepareGoodsUserId) {
        this.prepareGoodsUserId = prepareGoodsUserId == null ? null : prepareGoodsUserId.trim();
    }

    public String getPrepareGoodsStatus() {
        return prepareGoodsStatus;
    }

    public void setPrepareGoodsStatus(String prepareGoodsStatus) {
        this.prepareGoodsStatus = prepareGoodsStatus == null ? null : prepareGoodsStatus.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}