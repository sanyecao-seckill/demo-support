package com.demo.support;

import com.demo.support.dao.ActivityInfo;
import com.demo.support.dto.Result;
import com.demo.support.exception.BizException;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/8
 * @Version: 1.0.0
 */
public interface ActivityService {
    /**
     * 创建活动
     * @param activityInfo
     * @return
     */
    int createActivity(ActivityInfo activityInfo) throws BizException;

    /**
     * 查询活动
     * @param productId
     * @return
     */
    ActivityInfo queryActivityById(String productId);

    /**
     * 查询活动
     * @param productId
     * @return
     */
    ActivityInfo queryActivityByCondition(String productId,Integer status);

    /**
     * 活动开始
     * @param productId
     * @return
     */
    Integer startActivity(String productId) throws BizException;

    /**
     * 活动关闭
     * @param productId
     * @return
     */
    Integer endActivity(String productId) throws BizException;

    /**
     * 活动库存查询
     * @param productId
     * @return
     */
    Integer queryStore(String productId);
}
