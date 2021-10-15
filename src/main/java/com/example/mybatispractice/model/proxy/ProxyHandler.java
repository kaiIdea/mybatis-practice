package com.example.mybatispractice.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 10:31
 * @Description:
 */
public class ProxyHandler implements InvocationHandler {


    private UserInterface target;

    public ProxyHandler(UserInterface target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }


    public static void main(String[] args) {
        //动态代理，可以在代理方法前后，插入操作
        UserInterface userInterface = (UserInterface) Proxy.newProxyInstance(User.class.getClassLoader(),new Class[]{UserInterface.class},new ProxyHandler(new User()));
        userInterface.sayHello();
        System.out.printf("");
    }
}
