package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class WarehouseRegion implements Serializable {
    private String warehouseRegionId;

    private String warehouseRegionName;

    private Integer warehouseRegionArea;

    private String warehouseId;

    private Date warehouseRegionBuildDate;

    public String getWarehouseRegionId() {
        return warehouseRegionId;
    }

    public void setWarehouseRegionId(String warehouseRegionId) {
        this.warehouseRegionId = warehouseRegionId == null ? null : warehouseRegionId.trim();
    }

    public String getWarehouseRegionName() {
        return warehouseRegionName;
    }

    public void setWarehouseRegionName(String warehouseRegionName) {
        this.warehouseRegionName = warehouseRegionName == null ? null : warehouseRegionName.trim();
    }

    public Integer getWarehouseRegionArea() {
        return warehouseRegionArea;
    }

    public void setWarehouseRegionArea(Integer warehouseRegionArea) {
        this.warehouseRegionArea = warehouseRegionArea;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public Date getWarehouseRegionBuildDate() {
        return warehouseRegionBuildDate;
    }

    public void setWarehouseRegionBuildDate(Date warehouseRegionBuildDate) {
        this.warehouseRegionBuildDate = warehouseRegionBuildDate;
    }
}