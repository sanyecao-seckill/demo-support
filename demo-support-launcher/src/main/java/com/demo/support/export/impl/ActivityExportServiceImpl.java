package com.demo.support.export.impl;

import com.demo.support.ActivityService;
import com.demo.support.constant.ResultCodeConstant;
import com.demo.support.dao.ActivityInfo;
import com.demo.support.dto.Result;
import com.demo.support.dto.SeckillActivityDTO;
import com.demo.support.exception.BizException;
import com.demo.support.export.ActivityExportService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityExportServiceImpl implements ActivityExportService {

    Logger logger = LogManager.getLogger(ActivityExportServiceImpl.class);

    @Autowired
    ActivityService activityService;


    @Override
    public Result<Integer> queryStore(String productId) {
        try{
            Integer count = activityService.queryStore(productId);
            return new Result<>(count);
        }catch (Exception e){
            logger.error("发生异常了",e);
        }
        return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,"系统异常",null);
    }

    @Override
    public Result<Integer> createActivity(SeckillActivityDTO activityDTO) {
        try{
            ActivityInfo activityInfo = new ActivityInfo();

            BeanUtils.copyProperties(activityDTO,activityInfo);

            int count = activityService.createActivity(activityInfo);

            return new Result<>(count);
        }catch (BizException e){
            logger.error("发生异常了",e);
            return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,e.getMessage(),null);
        }catch (Exception e){
            logger.error("发生异常了",e);
        }
        return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,"系统异常",null);
    }

    @Override
    public Result<SeckillActivityDTO> queryActivity(String productId) {
        ActivityInfo activityInfo = activityService.queryActivityById(productId);

        SeckillActivityDTO activityDTO = new SeckillActivityDTO();

        BeanUtils.copyProperties(activityInfo,activityDTO);

        return new Result<>(activityDTO);
    }

    @Override
    public Result<SeckillActivityDTO> queryActivityByCondition(String productId, Integer status) {
        ActivityInfo activityInfo = activityService.queryActivityByCondition(productId,status);
        if(activityInfo == null){
            return new Result<>(null);
        }

        SeckillActivityDTO activityDTO = new SeckillActivityDTO();

        BeanUtils.copyProperties(activityInfo,activityDTO);

        return new Result<>(activityDTO);
    }

    @Override
    public Result<Integer> startActivity(String productId) {
        Integer count = 0;
        try{
           count = activityService.startActivity(productId);
        }catch (BizException e){
            return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,e.getErrorCode(),count);
        }catch (Exception e){
            return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,"系统异常",null);
        }
        return new Result<>(count);
    }

    @Override
    public Result<Integer> endActivity(String productId) {
        Integer count = 0;
        try{
            count = activityService.endActivity(productId);
        }catch (BizException e){
            return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,e.getErrorCode(),count);
        }catch (Exception e){
            return new Result<>(ResultCodeConstant.SYSTEM_EXCEPTION,"系统异常",null);
        }
        return new Result<>(count);
    }
}
