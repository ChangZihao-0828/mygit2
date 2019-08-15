package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class InGoods  implements Serializable {
    private String inGoodsId;

    private Date inGoodsIntime;

    private String warehouseId;

    private String prepareGoodsId;

    private String processinstanceId;

    public String getInGoodsId() {
        return inGoodsId;
    }

    public void setInGoodsId(String inGoodsId) {
        this.inGoodsId = inGoodsId == null ? null : inGoodsId.trim();
    }

    public Date getInGoodsIntime() {
        return inGoodsIntime;
    }

    public void setInGoodsIntime(Date inGoodsIntime) {
        this.inGoodsIntime = inGoodsIntime;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getPrepareGoodsId() {
        return prepareGoodsId;
    }

    public void setPrepareGoodsId(String prepareGoodsId) {
        this.prepareGoodsId = prepareGoodsId == null ? null : prepareGoodsId.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}