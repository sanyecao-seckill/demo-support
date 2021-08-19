package com.demo.support.mapper;

import com.demo.support.dao.ActivityInfo;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {

    /**
     * 创建活动
     * @param activityInfo
     * @return
     */
    int insert(ActivityInfo activityInfo);

    /**
     * 查询活动
     * @param id
     * @return
     */
    ActivityInfo selectById(Long id);

    /**
     * 查询活动(最近的一场)
     * @param productId
     * @return
     */
    ActivityInfo selectByProductId(@Param("productId") String productId);

    /**
     * 查询活动(按条件)
     * @param productId
     * @return
     */
    ActivityInfo selectByCondition(@Param("productId") String productId,@Param("status") Integer status);

    /**
     * 更新活动状态
     * @param
     * @return
     */
    int updateStatus(@Param("id") Long id,@Param("status") Integer status);

    /**
     * 更新库存
     * @param
     * @return
     */
    int updateStockNum(@Param("id") Long id,@Param("buyNum") Integer buyNum);

}
