package com.example.mybatispractice.type;

import org.apache.ibatis.type.*;

import java.math.BigDecimal;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/14 17:52
 * @Description:
 */
public class Test2 {

    public static void main(String[] args) {
        TypeHandlerRegistry registry = new TypeHandlerRegistry();
        registry.register(Boolean.class,new BooleanTypeHandler());
        registry.register(String.class,new StringTypeHandler());
        registry.register(Integer.class,new IntegerTypeHandler());
        registry.register(BigDecimal.class,new BigDecimalTypeHandler());
    }
}
