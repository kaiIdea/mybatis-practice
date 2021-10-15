package com.example.mybatispractice.model;

import lombok.Data;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 15:49
 * @Description:
 */
@Data
public class BaseResult {

    private String errorCode;
    private String errorMsg;
    private boolean success;



}
