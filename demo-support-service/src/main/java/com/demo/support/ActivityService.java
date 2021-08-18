package com.demo.support;

import com.demo.support.dao.ActivityInfo;

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
    int createActivity(ActivityInfo activityInfo);

    /**
     * 查询活动
     * @param productId
     * @return
     */
    ActivityInfo queryActivityById(String productId);
}
