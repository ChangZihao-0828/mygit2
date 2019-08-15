package org.java.entity;

import java.io.Serializable;

public class Cartype  implements Serializable {
    private Integer cartypeId;

    private String cartypeState;

    public Integer getCartypeId() {
        return cartypeId;
    }

    public void setCartypeId(Integer cartypeId) {
        this.cartypeId = cartypeId;
    }

    public String getCartypeState() {
        return cartypeState;
    }

    public void setCartypeState(String cartypeState) {
        this.cartypeState = cartypeState == null ? null : cartypeState.trim();
    }
}