package com.demo.support.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class SettlementDataDTO implements Serializable {

    private Integer payType;
    private BigDecimal totalPrice;
    private String address;
    private String assets;

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }
}
