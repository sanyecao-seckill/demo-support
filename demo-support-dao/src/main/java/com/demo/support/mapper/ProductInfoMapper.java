package com.demo.support.mapper;

import com.demo.support.dao.ProductInfo;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 查询商品
     * @param productId
     * @return
     */
    ProductInfo selectByProductId(@Param("productId") String productId);

}
