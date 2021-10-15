package com.example.mybatispractice.model.proxy;/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 10:13
 * @Description:
 */
public class User implements UserInterface{

    @Override
    public String sayHello() {
        System.out.printf("Hello World...");
        return null;
    }
}
