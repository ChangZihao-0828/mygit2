package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class CarDeployLine  implements Serializable {
    private String carDeployLineId;

    private Integer carId;

    private String deliverGoodsId;

    private String carFromSite;

    private String carToSite;

    private Date carDispatchDate;

    private String carMileage;

    private String carPrice;

    private String processinstanceId;

    public String getCarDeployLineId() {
        return carDeployLineId;
    }

    public void setCarDeployLineId(String carDeployLineId) {
        this.carDeployLineId = carDeployLineId == null ? null : carDeployLineId.trim();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getDeliverGoodsId() {
        return deliverGoodsId;
    }

    public void setDeliverGoodsId(String deliverGoodsId) {
        this.deliverGoodsId = deliverGoodsId == null ? null : deliverGoodsId.trim();
    }

    public String getCarFromSite() {
        return carFromSite;
    }

    public void setCarFromSite(String carFromSite) {
        this.carFromSite = carFromSite == null ? null : carFromSite.trim();
    }

    public String getCarToSite() {
        return carToSite;
    }

    public void setCarToSite(String carToSite) {
        this.carToSite = carToSite == null ? null : carToSite.trim();
    }

    public Date getCarDispatchDate() {
        return carDispatchDate;
    }

    public void setCarDispatchDate(Date carDispatchDate) {
        this.carDispatchDate = carDispatchDate;
    }

    public String getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(String carMileage) {
        this.carMileage = carMileage == null ? null : carMileage.trim();
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice == null ? null : carPrice.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}