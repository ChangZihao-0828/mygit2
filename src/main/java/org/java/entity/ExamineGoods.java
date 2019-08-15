package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class ExamineGoods   implements Serializable {
    private String examineGoodsId;

    private String inGoodsId;

    private String inEquipGoodsId;

    private String examineGoodsPeople;

    private Date examineGoodsTime;

    private String examineGoodsRemark;

    private String processinstanceId;

    public String getExamineGoodsId() {
        return examineGoodsId;
    }

    public void setExamineGoodsId(String examineGoodsId) {
        this.examineGoodsId = examineGoodsId == null ? null : examineGoodsId.trim();
    }

    public String getInGoodsId() {
        return inGoodsId;
    }

    public void setInGoodsId(String inGoodsId) {
        this.inGoodsId = inGoodsId == null ? null : inGoodsId.trim();
    }

    public String getInEquipGoodsId() {
        return inEquipGoodsId;
    }

    public void setInEquipGoodsId(String inEquipGoodsId) {
        this.inEquipGoodsId = inEquipGoodsId == null ? null : inEquipGoodsId.trim();
    }

    public String getExamineGoodsPeople() {
        return examineGoodsPeople;
    }

    public void setExamineGoodsPeople(String examineGoodsPeople) {
        this.examineGoodsPeople = examineGoodsPeople == null ? null : examineGoodsPeople.trim();
    }

    public Date getExamineGoodsTime() {
        return examineGoodsTime;
    }

    public void setExamineGoodsTime(Date examineGoodsTime) {
        this.examineGoodsTime = examineGoodsTime;
    }

    public String getExamineGoodsRemark() {
        return examineGoodsRemark;
    }

    public void setExamineGoodsRemark(String examineGoodsRemark) {
        this.examineGoodsRemark = examineGoodsRemark == null ? null : examineGoodsRemark.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}