package com.example.mybatispractice.annotations;

import java.lang.annotation.*;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/12 18:14
 * @Description:
 */
@Documented
@Target(value = ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Login {

    String value();
}
