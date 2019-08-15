package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class Motorcade  implements Serializable {
    private Integer motorcadeId;

    private String motorcadeName;

    private Integer motorcadePersoonCount;

    private Date motorcadeBuildDate;

    public Integer getMotorcadeId() {
        return motorcadeId;
    }

    public void setMotorcadeId(Integer motorcadeId) {
        this.motorcadeId = motorcadeId;
    }

    public String getMotorcadeName() {
        return motorcadeName;
    }

    public void setMotorcadeName(String motorcadeName) {
        this.motorcadeName = motorcadeName == null ? null : motorcadeName.trim();
    }

    public Integer getMotorcadePersoonCount() {
        return motorcadePersoonCount;
    }

    public void setMotorcadePersoonCount(Integer motorcadePersoonCount) {
        this.motorcadePersoonCount = motorcadePersoonCount;
    }

    public Date getMotorcadeBuildDate() {
        return motorcadeBuildDate;
    }

    public void setMotorcadeBuildDate(Date motorcadeBuildDate) {
        this.motorcadeBuildDate = motorcadeBuildDate;
    }
}