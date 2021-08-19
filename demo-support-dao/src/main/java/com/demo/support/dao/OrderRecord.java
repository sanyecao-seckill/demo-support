package com.demo.support.dao;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/8
 * @Version: 1.0.0
 */
public class OrderRecord {

    private long id;
    private String orderId;
    private String productId;
    private String userId;
    private Integer buyNum;
    private BigDecimal orderPrice;
    private String address;
    private Integer payType;
    private Date orderTime;
    private Integer orderStatus; //订单状态  0：初始化，1：成功待支付，2：完成，3：处理中，4：失败，5：订单取消

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

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
