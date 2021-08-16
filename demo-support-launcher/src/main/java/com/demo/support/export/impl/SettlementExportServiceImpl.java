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
        return null;
    }
}
