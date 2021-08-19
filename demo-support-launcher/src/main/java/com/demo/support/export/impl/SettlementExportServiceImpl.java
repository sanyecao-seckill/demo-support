package com.demo.support.export.impl;

import com.demo.support.ActivityService;
import com.demo.support.SettlementService;
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

    @Autowired
    SettlementService settlementService;

    @Override
    public Result<String> submitOrder(SettlementOrderDTO orderDTO) {

        String orderId = settlementService.submitOrder(orderDTO);

        return new Result<>(orderId);
    }

    @Override
    public Result<String> getPayPageUrl(String orderId) {
        String payPageUrl = "http://localhost:8080/payPage?orderId="+orderId+"&orderPrice=1998";
        return new Result<>(payPageUrl);
    }
}
