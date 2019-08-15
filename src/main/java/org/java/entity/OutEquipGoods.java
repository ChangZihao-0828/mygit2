package org.java.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class OutEquipGoods  implements Serializable {
    private String outEquipGoodsId;

    private String outGoodsId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outEquipGoodsBegintime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outEquipGoodsEndtime;

    private String outEquipGoodsPeople;

    private String outEquipGoodsStatus;

    private String processinstanceId;

    public String getOutEquipGoodsId() {
        return outEquipGoodsId;
    }

    public void setOutEquipGoodsId(String outEquipGoodsId) {
        this.outEquipGoodsId = outEquipGoodsId == null ? null : outEquipGoodsId.trim();
    }

    public String getOutGoodsId() {
        return outGoodsId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId == null ? null : outGoodsId.trim();
    }

    public Date getOutEquipGoodsBegintime() {
        return outEquipGoodsBegintime;
    }

    public void setOutEquipGoodsBegintime(Date outEquipGoodsBegintime) {
        this.outEquipGoodsBegintime = outEquipGoodsBegintime;
    }

    public Date getOutEquipGoodsEndtime() {
        return outEquipGoodsEndtime;
    }

    public void setOutEquipGoodsEndtime(Date outEquipGoodsEndtime) {
        this.outEquipGoodsEndtime = outEquipGoodsEndtime;
    }

    public String getOutEquipGoodsPeople() {
        return outEquipGoodsPeople;
    }

    public void setOutEquipGoodsPeople(String outEquipGoodsPeople) {
        this.outEquipGoodsPeople = outEquipGoodsPeople == null ? null : outEquipGoodsPeople.trim();
    }

    public String getOutEquipGoodsStatus() {
        return outEquipGoodsStatus;
    }

    public void setOutEquipGoodsStatus(String outEquipGoodsStatus) {
        this.outEquipGoodsStatus = outEquipGoodsStatus == null ? null : outEquipGoodsStatus.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}