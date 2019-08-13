package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class WarehouseCheck implements Serializable {
    private String warehouseCheckId;

    private String warehouseId;

    private String warehouseCheckUserId;

    private Date warehouseCheckDate;

    private String warehouseCheckResult;

    private String temperatureCheck;

    private String humidityCheck;

    private String sanitationCheck;

    public String getWarehouseCheckId() {
        return warehouseCheckId;
    }

    public void setWarehouseCheckId(String warehouseCheckId) {
        this.warehouseCheckId = warehouseCheckId == null ? null : warehouseCheckId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getWarehouseCheckUserId() {
        return warehouseCheckUserId;
    }

    public void setWarehouseCheckUserId(String warehouseCheckUserId) {
        this.warehouseCheckUserId = warehouseCheckUserId == null ? null : warehouseCheckUserId.trim();
    }

    public Date getWarehouseCheckDate() {
        return warehouseCheckDate;
    }

    public void setWarehouseCheckDate(Date warehouseCheckDate) {
        this.warehouseCheckDate = warehouseCheckDate;
    }

    public String getWarehouseCheckResult() {
        return warehouseCheckResult;
    }

    public void setWarehouseCheckResult(String warehouseCheckResult) {
        this.warehouseCheckResult = warehouseCheckResult == null ? null : warehouseCheckResult.trim();
    }

    public String getTemperatureCheck() {
        return temperatureCheck;
    }

    public void setTemperatureCheck(String temperatureCheck) {
        this.temperatureCheck = temperatureCheck == null ? null : temperatureCheck.trim();
    }

    public String getHumidityCheck() {
        return humidityCheck;
    }

    public void setHumidityCheck(String humidityCheck) {
        this.humidityCheck = humidityCheck == null ? null : humidityCheck.trim();
    }

    public String getSanitationCheck() {
        return sanitationCheck;
    }

    public void setSanitationCheck(String sanitationCheck) {
        this.sanitationCheck = sanitationCheck == null ? null : sanitationCheck.trim();
    }
}