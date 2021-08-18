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

}
