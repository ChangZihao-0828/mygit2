package org.java.entity;

import java.io.Serializable;

public class TakeGoods  implements Serializable {
    private String takeGoodsId;

    private String outGoodsId;

    private String takeGoodsPeople;

    private String takeGoodsRemark;

    private String processinstanceId;

    public String getTakeGoodsId() {
        return takeGoodsId;
    }

    public void setTakeGoodsId(String takeGoodsId) {
        this.takeGoodsId = takeGoodsId == null ? null : takeGoodsId.trim();
    }

    public String getOutGoodsId() {
        return outGoodsId;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId == null ? null : outGoodsId.trim();
    }

    public String getTakeGoodsPeople() {
        return takeGoodsPeople;
    }

    public void setTakeGoodsPeople(String takeGoodsPeople) {
        this.takeGoodsPeople = takeGoodsPeople == null ? null : takeGoodsPeople.trim();
    }

    public String getTakeGoodsRemark() {
        return takeGoodsRemark;
    }

    public void setTakeGoodsRemark(String takeGoodsRemark) {
        this.takeGoodsRemark = takeGoodsRemark == null ? null : takeGoodsRemark.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}