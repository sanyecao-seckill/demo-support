package com.demo.support.dto;

import java.io.Serializable;
import java.util.Date;

public class SeckillActivityDTO implements Serializable {

    private long id;
    private String activityName;
    private String productId;
    private Date activityStart;
    private Date activityEnd;
    private Integer limitNum;
    private Integer stockNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

    public Date getActivityStart() {
        return activityStart;
    }

    public void setActivityStart(Date activityStart) {
        this.activityStart = activityStart;
    }

    public Date getActivityEnd() {
        return activityEnd;
    }

    public void setActivityEnd(Date activityEnd) {
        this.activityEnd = activityEnd;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }
}
