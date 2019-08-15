package org.java.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CustomerOrder   implements Serializable {
    private String customerOrderId;

    private String customerOrderType;

    private String customerOrderDeclaration;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerGetgoodstime;

    private String customerOrderLinkman;

    private String customerOrderAddress;

    private String customerOrderNameId;

    private String customerOrderGetgoodstype;

    private String customerOrderModeofpayment;

    private String customerOrderState;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerOrderTime;

    private String customerOrderRests;

    private String customerOrderOrderRemark;

    private String customerOrderpackr;

    private String customerOrderDptr;

    private String customerOrderSmr;

    private String processinstanceId;

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId == null ? null : customerOrderId.trim();
    }

    public String getCustomerOrderType() {
        return customerOrderType;
    }

    public void setCustomerOrderType(String customerOrderType) {
        this.customerOrderType = customerOrderType == null ? null : customerOrderType.trim();
    }

    public String getCustomerOrderDeclaration() {
        return customerOrderDeclaration;
    }

    public void setCustomerOrderDeclaration(String customerOrderDeclaration) {
        this.customerOrderDeclaration = customerOrderDeclaration == null ? null : customerOrderDeclaration.trim();
    }

    public Date getCustomerGetgoodstime() {
        return customerGetgoodstime;
    }

    public void setCustomerGetgoodstime(Date customerGetgoodstime) {
        this.customerGetgoodstime = customerGetgoodstime;
    }

    public String getCustomerOrderLinkman() {
        return customerOrderLinkman;
    }

    public void setCustomerOrderLinkman(String customerOrderLinkman) {
        this.customerOrderLinkman = customerOrderLinkman == null ? null : customerOrderLinkman.trim();
    }

    public String getCustomerOrderAddress() {
        return customerOrderAddress;
    }

    public void setCustomerOrderAddress(String customerOrderAddress) {
        this.customerOrderAddress = customerOrderAddress == null ? null : customerOrderAddress.trim();
    }

    public String getCustomerOrderNameId() {
        return customerOrderNameId;
    }

    public void setCustomerOrderNameId(String customerOrderNameId) {
        this.customerOrderNameId = customerOrderNameId == null ? null : customerOrderNameId.trim();
    }

    public String getCustomerOrderGetgoodstype() {
        return customerOrderGetgoodstype;
    }

    public void setCustomerOrderGetgoodstype(String customerOrderGetgoodstype) {
        this.customerOrderGetgoodstype = customerOrderGetgoodstype == null ? null : customerOrderGetgoodstype.trim();
    }

    public String getCustomerOrderModeofpayment() {
        return customerOrderModeofpayment;
    }

    public void setCustomerOrderModeofpayment(String customerOrderModeofpayment) {
        this.customerOrderModeofpayment = customerOrderModeofpayment == null ? null : customerOrderModeofpayment.trim();
    }

    public String getCustomerOrderState() {
        return customerOrderState;
    }

    public void setCustomerOrderState(String customerOrderState) {
        this.customerOrderState = customerOrderState == null ? null : customerOrderState.trim();
    }

    public Date getCustomerOrderTime() {
        return customerOrderTime;
    }

    public void setCustomerOrderTime(Date customerOrderTime) {
        this.customerOrderTime = customerOrderTime;
    }

    public String getCustomerOrderRests() {
        return customerOrderRests;
    }

    public void setCustomerOrderRests(String customerOrderRests) {
        this.customerOrderRests = customerOrderRests == null ? null : customerOrderRests.trim();
    }

    public String getCustomerOrderOrderRemark() {
        return customerOrderOrderRemark;
    }

    public void setCustomerOrderOrderRemark(String customerOrderOrderRemark) {
        this.customerOrderOrderRemark = customerOrderOrderRemark == null ? null : customerOrderOrderRemark.trim();
    }

    public String getCustomerOrderpackr() {
        return customerOrderpackr;
    }

    public void setCustomerOrderpackr(String customerOrderpackr) {
        this.customerOrderpackr = customerOrderpackr == null ? null : customerOrderpackr.trim();
    }

    public String getCustomerOrderDptr() {
        return customerOrderDptr;
    }

    public void setCustomerOrderDptr(String customerOrderDptr) {
        this.customerOrderDptr = customerOrderDptr == null ? null : customerOrderDptr.trim();
    }

    public String getCustomerOrderSmr() {
        return customerOrderSmr;
    }

    public void setCustomerOrderSmr(String customerOrderSmr) {
        this.customerOrderSmr = customerOrderSmr == null ? null : customerOrderSmr.trim();
    }

    public String getProcessinstanceId() {
        return processinstanceId;
    }

    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }
}