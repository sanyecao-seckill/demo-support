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

    /**
     * 更新商品标签 1：正常商品，2：秒杀商品 3：预约商品
     * @param productId
     * @return
     */
    int updateTag(@Param("productId") String productId,@Param("tag") Integer tag);

}
