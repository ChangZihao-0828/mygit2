package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class StockCheck  implements Serializable {
    private String stockCheckId;

    private String userId;

    private Date checkDate;

    private String matterId;

    private Integer stockCount;

    private String warehouseId;

    private String warehouseRegionId;

    private String warehousePositionId;

    public String getStockCheckId() {
        return stockCheckId;
    }

    public void setStockCheckId(String stockCheckId) {
        this.stockCheckId = stockCheckId == null ? null : stockCheckId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getWarehouseRegionId() {
        return warehouseRegionId;
    }

    public void setWarehouseRegionId(String warehouseRegionId) {
        this.warehouseRegionId = warehouseRegionId == null ? null : warehouseRegionId.trim();
    }

    public String getWarehousePositionId() {
        return warehousePositionId;
    }

    public void setWarehousePositionId(String warehousePositionId) {
        this.warehousePositionId = warehousePositionId == null ? null : warehousePositionId.trim();
    }
}