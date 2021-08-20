package com.demo.support.impl;

import com.demo.support.dao.ActivityInfo;
import com.demo.support.ActivityService;
import com.demo.support.exception.BizException;
import com.demo.support.mapper.ActivityMapper;
import com.demo.support.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public int createActivity(ActivityInfo activityInfo) {
        return activityMapper.insert(activityInfo);
    }

    @Override
    public ActivityInfo queryActivityById(String productId) {
        return activityMapper.selectByProductId(productId);
    }

    @Override
    public ActivityInfo queryActivityByCondition(String productId,Integer status) {
        return activityMapper.selectByCondition(productId,status);
    }

    @Override
    public Integer startActivity(String productId) throws BizException {
        //查询未开始的
        ActivityInfo activityInfo = activityMapper.selectByCondition(productId,0);
        //判断时间是否在有效期内
        Date now = new Date();
        if(now.before(activityInfo.getActivityStart())){
            throw new BizException("活动尚未开始束");
        }
        if(now.after(activityInfo.getActivityEnd())){
            throw new BizException("活动已结束");
        }
        //更改活动为开始状态
        activityMapper.updateStatus(activityInfo.getId(),1);
        //更改商品标识为秒杀
        productInfoMapper.updateTag(productId,2);
        return 1;
    }

    @Override
    public Integer endActivity(String productId) throws BizException {
        //查询进行中的
        ActivityInfo activityInfo = activityMapper.selectByCondition(productId,1);
        //更改活动为结束状态
        activityMapper.updateStatus(activityInfo.getId(),2);
        //更改商品标识为普通
        productInfoMapper.updateTag(productId,1);
        return 1;
    }
}
