package org.java.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class OutGoods  implements Serializable {
    private String outGoodsId;

    private String warehouseId;

    private String customerOrderId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outGoodsTime;

    private String outGoodsStatus;

    private String processinstanceId;

    public String getOutGoodsId() {
        return outGoodsId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId == null ? null : outGoodsId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public Date getOutGoodsTime() {
        return outGoodsTime;
    }

    public void setOutGoodsTime(Date outGoodsTime) {
        this.outGoodsTime = outGoodsTime;
    }

    public String getOutGoodsStatus() {
        return outGoodsStatus;
    }

    public void setOutGoodsStatus(String outGoodsStatus) {
        this.outGoodsStatus = outGoodsStatus == null ? null : outGoodsStatus.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}