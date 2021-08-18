package com.demo.support.export;

import com.demo.support.dto.Result;
import com.demo.support.dto.SeckillActivityDTO;
import com.demo.support.dto.SettlementOrderDTO;

public interface SettlementExportService {

    /**
     * 下单
     * @param orderDTO
     * @return 订单号
     */
    Result<String> submitOrder(SettlementOrderDTO orderDTO);

    /**
     * 获取支付页URL
     */
    Result<String> payPageUrl(String orderId);

}
