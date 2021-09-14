package com.demo.support.export.impl;

import com.demo.support.ActivityService;
import com.demo.support.SettlementService;
import com.demo.support.dao.OrderRecord;
import com.demo.support.dto.Result;
import com.demo.support.dto.SettlementDataDTO;
import com.demo.support.dto.SettlementDataRequestDTO;
import com.demo.support.dto.SettlementOrderDTO;
import com.demo.support.export.SettlementExportService;
import com.demo.support.mapper.OrderRecordMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class SettlementExportServiceImpl implements SettlementExportService {

    Logger logger = LogManager.getLogger(SettlementExportServiceImpl.class);

    @Autowired
    ActivityService activityService;

    @Autowired
    SettlementService settlementService;

    @Autowired
    OrderRecordMapper orderRecordMapper;

    @Override
    public Result<SettlementDataDTO> settlementData(SettlementDataRequestDTO requestDTO) {
        SettlementDataDTO dataDTO = settlementService.settlementData(requestDTO);
        return new Result<>(dataDTO);
    }

    @Override
    public Result<String> submitOrder(SettlementOrderDTO orderDTO) {
        try{
            String orderId = settlementService.submitOrder(orderDTO);

            return new Result<>(orderId);
        }catch (Exception e){
            logger.error("提单异常",e);
        }
        return new Result<>(null);
    }

    @Override
    public Result<String> getPayPageUrl(String orderId) {
        OrderRecord orderRecord = orderRecordMapper.selectByOrderId(orderId);
        String payPageUrl = "http://localhost:8080/mock/payPage?orderId="+orderId+"&orderPrice="+orderRecord.getOrderPrice().toPlainString();
        return new Result<>(payPageUrl);
    }
}
