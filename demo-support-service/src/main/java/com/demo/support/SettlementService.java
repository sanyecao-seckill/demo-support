package com.demo.support;

import com.demo.support.dto.Result;
import com.demo.support.dto.SettlementOrderDTO;

public interface SettlementService {

    /**
     * 下单
     * @param orderDTO
     * @return 订单号
     */
    Result<String> submitOrder(SettlementOrderDTO orderDTO);


}
