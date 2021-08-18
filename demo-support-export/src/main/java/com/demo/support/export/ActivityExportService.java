package com.demo.support.export;

import com.demo.support.dto.Result;
import com.demo.support.dto.SeckillActivityDTO;

public interface ActivityExportService {

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

}
