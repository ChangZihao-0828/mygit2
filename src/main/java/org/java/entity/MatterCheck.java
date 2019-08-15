package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class MatterCheck  implements Serializable {
    private String matterCheckId;

    private String warehousePositionId;

    private String matterCheckUserId;

    private Date matterCheckDate;

    private String matterCheckResult;

    private String temperatureCheck;

    private String humidityCheck;

    private String sanitationCheck;

    private String metamorphicCheck;

    private String wearoutCheck;

    public String getMatterCheckId() {
        return matterCheckId;
    }

    public void setMatterCheckId(String matterCheckId) {
        this.matterCheckId = matterCheckId == null ? null : matterCheckId.trim();
    }

    public String getWarehousePositionId() {
        return warehousePositionId;
    }

    public void setWarehousePositionId(String warehousePositionId) {
        this.warehousePositionId = warehousePositionId == null ? null : warehousePositionId.trim();
    }

    public String getMatterCheckUserId() {
        return matterCheckUserId;
    }

    public void setMatterCheckUserId(String matterCheckUserId) {
        this.matterCheckUserId = matterCheckUserId == null ? null : matterCheckUserId.trim();
    }

    public Date getMatterCheckDate() {
        return matterCheckDate;
    }

    public void setMatterCheckDate(Date matterCheckDate) {
        this.matterCheckDate = matterCheckDate;
    }

    public String getMatterCheckResult() {
        return matterCheckResult;
    }

    public void setMatterCheckResult(String matterCheckResult) {
        this.matterCheckResult = matterCheckResult == null ? null : matterCheckResult.trim();
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

    public String getMetamorphicCheck() {
        return metamorphicCheck;
    }

    public void setMetamorphicCheck(String metamorphicCheck) {
        this.metamorphicCheck = metamorphicCheck == null ? null : metamorphicCheck.trim();
    }

    public String getWearoutCheck() {
        return wearoutCheck;
    }

    public void setWearoutCheck(String wearoutCheck) {
        this.wearoutCheck = wearoutCheck == null ? null : wearoutCheck.trim();
    }
}