package com.demo.support.mapper;

import com.demo.support.dao.ActivityInfo;

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

}
