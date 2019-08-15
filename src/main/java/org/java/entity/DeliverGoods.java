package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class DeliverGoods  implements Serializable {
    private String deliverGoodsId;

    private Date deliverDate;

    private String userId;

    private String customerOrderId;

    private String customerId;

    private String processinstanceId;

    public String getDeliverGoodsId() {
        return deliverGoodsId;
    }

    public void setDeliverGoodsId(String deliverGoodsId) {
        this.deliverGoodsId = deliverGoodsId == null ? null : deliverGoodsId.trim();
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}