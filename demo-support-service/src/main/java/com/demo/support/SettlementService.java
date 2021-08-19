package com.demo.support;

import com.demo.support.dto.Result;
import com.demo.support.dto.SettlementDataDTO;
import com.demo.support.dto.SettlementDataRequestDTO;
import com.demo.support.dto.SettlementOrderDTO;

public interface SettlementService {

    /**
     * 下单
     * @param orderDTO
     * @return 订单号
     */
    String submitOrder(SettlementOrderDTO orderDTO);


    SettlementDataDTO settlementData(SettlementDataRequestDTO requestDTO);
}
