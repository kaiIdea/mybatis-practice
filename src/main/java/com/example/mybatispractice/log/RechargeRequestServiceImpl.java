package com.example.mybatispractice.log;

import com.example.mybatispractice.model.BaseResult;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 15:52
 * @Description:
 */
public class RechargeRequestServiceImpl implements ThirdRequestService{


    @Override
    public BaseResult request(String param) {
        System.out.printf("充值成功...");
        return null;
    }
}
