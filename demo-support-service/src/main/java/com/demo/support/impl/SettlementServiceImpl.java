package com.demo.support.impl;

import com.demo.support.SettlementService;
import com.demo.support.dto.Result;
import com.demo.support.dto.SettlementOrderDTO;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/10
 * @Version: 1.0.0
 */
@Service
public class SettlementServiceImpl implements SettlementService {

    @Override
    public Result<String> submitOrder(SettlementOrderDTO orderDTO) {
        return null;
    }
}
