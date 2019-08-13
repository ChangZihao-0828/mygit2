package org.java.entity;

import java.io.Serializable;

public class Supplier  implements Serializable {
    private String supplierId;

    private String supplierName;

    private String supplierPwd;

    private String supplierContacts;

    private Integer supplierCreditiimit;

    private String supplierShortname;

    private Integer supplierTelephone;

    private String supplierEmail;

    private String supplierAddress;

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierPwd() {
        return supplierPwd;
    }

    public void setSupplierPwd(String supplierPwd) {
        this.supplierPwd = supplierPwd == null ? null : supplierPwd.trim();
    }

    public String getSupplierContacts() {
        return supplierContacts;
    }

    public void setSupplierContacts(String supplierContacts) {
        this.supplierContacts = supplierContacts == null ? null : supplierContacts.trim();
    }

    public Integer getSupplierCreditiimit() {
        return supplierCreditiimit;
    }

    public void setSupplierCreditiimit(Integer supplierCreditiimit) {
        this.supplierCreditiimit = supplierCreditiimit;
    }

    public String getSupplierShortname() {
        return supplierShortname;
    }

    public void setSupplierShortname(String supplierShortname) {
        this.supplierShortname = supplierShortname == null ? null : supplierShortname.trim();
    }

    public Integer getSupplierTelephone() {
        return supplierTelephone;
    }

    public void setSupplierTelephone(Integer supplierTelephone) {
        this.supplierTelephone = supplierTelephone;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }
}