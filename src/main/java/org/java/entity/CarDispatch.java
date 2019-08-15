package org.java.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CarDispatch  implements Serializable {
    private String carDispatchId;

    private Integer carId;

    private String deliverGoodsId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date carGoDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date carBackDate;

    private String carDispatchStatus;

    private String processinstanceId;

    public String getCarDispatchId() {
        return carDispatchId;
    }

    public void setCarDispatchId(String carDispatchId) {
        this.carDispatchId = carDispatchId == null ? null : carDispatchId.trim();
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

    public Date getCarGoDate() {
        return carGoDate;
    }

    public void setCarGoDate(Date carGoDate) {
        this.carGoDate = carGoDate;
    }

    public Date getCarBackDate() {
        return carBackDate;
    }

    public void setCarBackDate(Date carBackDate) {
        this.carBackDate = carBackDate;
    }

    public String getCarDispatchStatus() {
        return carDispatchStatus;
    }

    public void setCarDispatchStatus(String carDispatchStatus) {
        this.carDispatchStatus = carDispatchStatus == null ? null : carDispatchStatus.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}