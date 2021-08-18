package com.demo.support.dao;

import java.util.Date;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/8
 * @Version: 1.0.0
 */
public class ActivityInfo {

    private long id;
    private String activityName;
    private String productId;
    private Date activityStart;
    private Date activityEnd;
    private Integer limitNum;
    private Integer stockNum;
    private Integer status;//0:未开始  1：已开始  2：已结束

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
