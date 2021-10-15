package com.example.mybatispractice.log;

import com.example.mybatispractice.model.BaseResult;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 15:51
 * @Description:
 */
public class WithdrawRequestServiceImpl implements ThirdRequestService{
    @Override
    public BaseResult request(String param) {
        System.out.printf("提现成功...");
        return null;
    }
}
