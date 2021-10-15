package com.example.mybatispractice.log;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/15 15:53
 * @Description:
 */
public class ProxyRequestHandler implements InvocationHandler {


    private ThirdRequestService service;

    public ProxyRequestHandler(ThirdRequestService service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(service,args);
    }


    public static ThirdRequestService newInstance(ThirdRequestService service){
        InvocationHandler handler = new ProxyRequestHandler(service);
        return (ThirdRequestService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                new Class[]{ThirdRequestService.class},handler);
    }

    //生成代理接口 实现类。
}
