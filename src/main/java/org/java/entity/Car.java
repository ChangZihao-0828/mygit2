package org.java.entity;

import java.io.Serializable;

public class Car  implements Serializable {
    private Integer carId;

    private Integer carTypeId;

    private String carBrand;

    private Integer motorcadeId;

    private Integer carLoad;

    private Integer carBulk;

    private String carState;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public Integer getMotorcadeId() {
        return motorcadeId;
    }

    public void setMotorcadeId(Integer motorcadeId) {
        this.motorcadeId = motorcadeId;
    }

    public Integer getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(Integer carLoad) {
        this.carLoad = carLoad;
    }

    public Integer getCarBulk() {
        return carBulk;
    }

    public void setCarBulk(Integer carBulk) {
        this.carBulk = carBulk;
    }

    public String getCarState() {
        return carState;
    }

    public void setCarState(String carState) {
        this.carState = carState == null ? null : carState.trim();
    }
}