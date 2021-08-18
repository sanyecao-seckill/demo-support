package com.demo.support.export;

import com.demo.support.dto.ProductInfoDTO;
import com.demo.support.dto.Result;

public interface ProductExportService {

    /**
     * 创建商品
     * @param productInfoDTO
     * @return
     */
    Result<Integer> createProduct(ProductInfoDTO productInfoDTO);


    /**
     * 查询商品
     * @param productId
     * @return
     */
    Result<ProductInfoDTO> queryProduct(String productId);

}
