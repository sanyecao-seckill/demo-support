package com.demo.support.mapper;

import com.demo.support.dao.ProductInfo;

public interface ProductInfoMapper {

    /**
     * 创建商品
     * @param productInfo
     * @return
     */
    int insert(ProductInfo productInfo);

    /**
     * 查询商品
     * @param id
     * @return
     */
    ProductInfo selectById(Long id);

}
