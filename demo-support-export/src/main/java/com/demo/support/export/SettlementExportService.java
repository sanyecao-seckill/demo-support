package com.demo.support.export;

import com.demo.support.dto.*;

public interface SettlementExportService {

    /**
     * 结算页初始化所需数据
     *    主要返回结算页所需的结算元素，包括用户地址，支付方式、配送时效、虚拟资产、价格相关数据（商品金额、抵扣金额等等）
     * @return
     */
    Result<SettlementDataDTO> settlementData(SettlementDataRequestDTO requestDTO);

    /**
     * 下单
     * @param orderDTO
     * @return 订单号
     */
    Result<String> submitOrder(SettlementOrderDTO orderDTO);

    /**
     * 获取支付页URL
     */
    Result<String> getPayPageUrl(String orderId);

}
