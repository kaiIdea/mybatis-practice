package com.example.mybatispractice.reflection;

import com.example.mybatispractice.model.User;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 17:22
 * @Description:
 */
public class Test4 {

    private static ConcurrentMap<Class<?>, Reflector> reflectorMap = new ConcurrentHashMap();

    public static void main(String[] args) {
        //反射获取类的所有属性，方法信息
        Reflector reflector = new Reflector(User.class);
        System.out.println();


        ReflectorFactory reflectorFactory = new DefaultReflectorFactory();
        //Reflector rr = reflectorFactory.findForClass(User.class);
        //computeIfAbsent 如果Key值不存在，调用new Reflector(User.class);
        //mappingFunction.apply 将此函数应用于给定的参数/调用此函数，参数为key
        Reflector rr = reflectorMap.computeIfAbsent(User.class,Reflector::new);
        System.out.println();
    }
}
