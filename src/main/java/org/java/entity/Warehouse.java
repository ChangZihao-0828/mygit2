package org.java.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Warehouse implements Serializable {
    private String warehouseId;

    private String warehouseName;

    private Integer warehouseArea;

    private Integer warehouseType;

    private String warehouseAddress;

    private String warehouseEnable;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date warehouseBuildDate;

    private String warehouseManager;

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public Integer getWarehouseArea() {
        return warehouseArea;
    }

    public void setWarehouseArea(Integer warehouseArea) {
        this.warehouseArea = warehouseArea;
    }

    public Integer getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(Integer warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress == null ? null : warehouseAddress.trim();
    }

    public String getWarehouseEnable() {
        return warehouseEnable;
    }

    public void setWarehouseEnable(String warehouseEnable) {
        this.warehouseEnable = warehouseEnable == null ? null : warehouseEnable.trim();
    }

    public Date getWarehouseBuildDate() {
        return warehouseBuildDate;
    }

    public void setWarehouseBuildDate(Date warehouseBuildDate) {
        this.warehouseBuildDate = warehouseBuildDate;
    }

    public String getWarehouseManager() {
        return warehouseManager;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager == null ? null : warehouseManager.trim();
    }
}