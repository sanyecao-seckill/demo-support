package com.demo.support.export.impl;

import com.demo.support.ActivityService;
import com.demo.support.dto.Result;
import com.demo.support.dto.SettlementOrderDTO;
import com.demo.support.export.SettlementExportService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class SettlementExportServiceImpl implements SettlementExportService {

    Logger logger = LogManager.getLogger(SettlementExportServiceImpl.class);

    @Autowired
    ActivityService activityService;

    @Override
    public Result<String> submitOrder(SettlementOrderDTO orderDTO) {
        //1.校验

        //2.下单-初始化

        //3.更新库存

        //4.更新订单-成功

        return null;
    }

    @Override
    public Result<String> getPayPageUrl(String orderId) {
        String payPageUrl = "http://localhost:8080/payPage?orderId="+orderId;
        return new Result<>(payPageUrl);
    }
}
