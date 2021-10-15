package com.example.mybatispractice.log;

import com.example.mybatispractice.model.User;
import org.apache.ibatis.logging.LogFactory;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 13:57
 * @Description:
 */
public class Test1 {


    public static void main(String[] args) {

        Runnable runnable = LogFactory::useNoLogging;
        tryImplementation(User::getValidate1);
    }


    private static void tryImplementation(Runnable runnable) {

    }
}
