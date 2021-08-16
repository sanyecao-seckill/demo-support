package com.demo.support.export.impl;

import com.demo.support.ActivityService;
import com.demo.support.constant.ResultCodeConstant;
import com.demo.support.dao.ActivityInfo;
import com.demo.support.dto.ProductInfoDTO;
import com.demo.support.dto.Result;
import com.demo.support.dto.SeckillActivityDTO;
import com.demo.support.export.ActivityExportService;
import com.demo.support.export.ProductExportService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductExportServiceImpl implements ProductExportService {

    Logger logger = LogManager.getLogger(ProductExportServiceImpl.class);

    @Autowired
    ActivityService activityService;

    @Override
    public Result<Integer> createProduct(ProductInfoDTO productInfoDTO) {
        return null;
    }

    @Override
    public Result<ProductInfoDTO> queryProduct(Long id) {
        return null;
    }
}
