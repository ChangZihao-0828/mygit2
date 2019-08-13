package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class WarehousePosition implements Serializable {
    private String warehousePositionId;

    private String warehousePositionRegionId;

    private String warehouseId;

    private Integer warehousePositionArea;

    private Date warehousePositionBuildDate;

    public String getWarehousePositionId() {
        return warehousePositionId;
    }

    public void setWarehousePositionId(String warehousePositionId) {
        this.warehousePositionId = warehousePositionId == null ? null : warehousePositionId.trim();
    }

    public String getWarehousePositionRegionId() {
        return warehousePositionRegionId;
    }

    public void setWarehousePositionRegionId(String warehousePositionRegionId) {
        this.warehousePositionRegionId = warehousePositionRegionId == null ? null : warehousePositionRegionId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public Integer getWarehousePositionArea() {
        return warehousePositionArea;
    }

    public void setWarehousePositionArea(Integer warehousePositionArea) {
        this.warehousePositionArea = warehousePositionArea;
    }

    public Date getWarehousePositionBuildDate() {
        return warehousePositionBuildDate;
    }

    public void setWarehousePositionBuildDate(Date warehousePositionBuildDate) {
        this.warehousePositionBuildDate = warehousePositionBuildDate;
    }
}