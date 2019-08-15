package org.java.entity;

import java.io.Serializable;

public class Vocation implements Serializable {
    private Integer vocationId;

    private String vocationName;

    public Integer getVocationId() {
        return vocationId;
    }

    public void setVocationId(Integer vocationId) {
        this.vocationId = vocationId;
    }

    public String getVocationName() {
        return vocationName;
    }

    public void setVocationName(String vocationName) {
        this.vocationName = vocationName == null ? null : vocationName.trim();
    }
}