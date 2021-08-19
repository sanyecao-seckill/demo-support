package com.demo.support.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class SettlementDataRequestDTO implements Serializable {

    private String userId;
    private Integer buyNum;
    private String productId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
