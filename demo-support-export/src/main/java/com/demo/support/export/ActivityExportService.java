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
     * 查询活动
     * @param id
     * @return
     */
    Result<SeckillActivityDTO> queryActivity(Long id);

}
