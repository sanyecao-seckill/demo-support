package com.demo.support.export;

import com.demo.support.dto.Result;
import com.demo.support.dto.SeckillActivityDTO;

public interface ActivityExportService {

    /**
     * 查询活动库存
     * @param productId
     * @return
     */
    Result<Integer> queryStore(String productId);

    /**
     * 创建活动
     * @param activityDTO
     * @return
     */
    Result<Integer> createActivity(SeckillActivityDTO activityDTO);


    /**
     * 查询活动(查询活动最近的一场)
     * @param productId
     * @return
     */
    Result<SeckillActivityDTO> queryActivity(String productId);

    /**
     * 查询活动
     * @param productId
     * @return
     */
    Result<SeckillActivityDTO> queryActivityByCondition(String productId,Integer status);

    /**
     * 活动开始
     * @param productId
     * @return
     */
    Result<Integer> startActivity(String productId);

    /**
     * 活动关闭
     * @param productId
     * @return
     */
    Result<Integer> endActivity(String productId);

}
