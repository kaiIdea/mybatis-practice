package com.example.mybatispractice.log;

import com.example.mybatispractice.model.BaseResult;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 15:48
 * @Description: 三方请求接口
 */
public interface ThirdRequestService {


    /**
     * 请求接口
     * @param param
     * @return
     */
    BaseResult request(String param);
}
