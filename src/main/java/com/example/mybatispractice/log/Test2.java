package com.example.mybatispractice.log;

import com.example.mybatispractice.model.BaseResult;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 16:00
 * @Description:
 */
public class Test2 {

    public static void main(String[] args) {
        ThirdRequestService requestService = ProxyRequestHandler.newInstance(new ThirdRequestService() {
            @Override
            public BaseResult request(String param) {
                System.out.println("我自己执行，行不行...");
                return null;
            }
        });
        requestService.request("");
    }
}
