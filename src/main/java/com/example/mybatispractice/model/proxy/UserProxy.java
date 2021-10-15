package com.example.mybatispractice.model.proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 10:14
 * @Description:
 */
public class UserProxy implements UserInterface{

    private UserInterface userInterface;


    public UserProxy(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public String sayHello() {
        userInterface.sayHello();
        return null;
    }
}
