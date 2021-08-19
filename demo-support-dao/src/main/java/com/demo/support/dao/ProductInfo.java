package com.demo.support.dao;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/8
 * @Version: 1.0.0
 */
public class ProductInfo {

    private long id;
    private String productId;
    private String productName;
    private String pictureUrl;
    private BigDecimal productPrice;
    private Integer tag;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }
}
