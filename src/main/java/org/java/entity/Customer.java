package org.java.entity;

import java.io.Serializable;

public class Customer  implements Serializable {
    private String customerId;

    private String customerName;

    private String customerPwd;

    private String customerShortname;

    private Integer customerVocationId;

    private Integer customerTelephone;

    private String customerContacts;

    private Integer customerCreditiimit;

    private String customerEmail;

    private String customerAddress;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd == null ? null : customerPwd.trim();
    }

    public String getCustomerShortname() {
        return customerShortname;
    }

    public void setCustomerShortname(String customerShortname) {
        this.customerShortname = customerShortname == null ? null : customerShortname.trim();
    }

    public Integer getCustomerVocationId() {
        return customerVocationId;
    }

    public void setCustomerVocationId(Integer customerVocationId) {
        this.customerVocationId = customerVocationId;
    }

    public Integer getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(Integer customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerContacts() {
        return customerContacts;
    }

    public void setCustomerContacts(String customerContacts) {
        this.customerContacts = customerContacts == null ? null : customerContacts.trim();
    }

    public Integer getCustomerCreditiimit() {
        return customerCreditiimit;
    }

    public void setCustomerCreditiimit(Integer customerCreditiimit) {
        this.customerCreditiimit = customerCreditiimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }
}