package com.demo.support.impl;

import com.demo.support.dao.ActivityInfo;
import com.demo.support.ActivityService;
import com.demo.support.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/10
 * @Version: 1.0.0
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityMapper activityMapper;

    @Override
    public int createActivity(ActivityInfo activityInfo) {
        return activityMapper.insert(activityInfo);
    }

    @Override
    public ActivityInfo queryActivityById(Long id) {
        return activityMapper.selectById(id);
    }
}
