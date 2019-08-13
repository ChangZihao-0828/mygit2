package org.java.entity;

import java.io.Serializable;
import java.util.Date;

public class MatterReject  implements Serializable {
    private String matterRejectId;

    private String matterId;

    private String matterUserId;

    private Date matterRejectDate;

    private String matterRejectReason;

    public String getMatterRejectId() {
        return matterRejectId;
    }

    public void setMatterRejectId(String matterRejectId) {
        this.matterRejectId = matterRejectId == null ? null : matterRejectId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getMatterUserId() {
        return matterUserId;
    }

    public void setMatterUserId(String matterUserId) {
        this.matterUserId = matterUserId == null ? null : matterUserId.trim();
    }

    public Date getMatterRejectDate() {
        return matterRejectDate;
    }

    public void setMatterRejectDate(Date matterRejectDate) {
        this.matterRejectDate = matterRejectDate;
    }

    public String getMatterRejectReason() {
        return matterRejectReason;
    }

    public void setMatterRejectReason(String matterRejectReason) {
        this.matterRejectReason = matterRejectReason == null ? null : matterRejectReason.trim();
    }
}