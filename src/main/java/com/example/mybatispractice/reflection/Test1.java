package com.example.mybatispractice.reflection;

import com.example.mybatispractice.model.User;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 15:52
 * @Description:
 */
public class Test1 {

    public static void main(String[] args) {
        ObjectFactory factory = new DefaultObjectFactory();
        List<Class<?>> list = new ArrayList<>();
        list.add(String.class);
        list.add(Integer.class);
        List<Object> obj = new ArrayList<>();
        obj.add("keke");
        obj.add(22);
        User user = factory.create(User.class,list,obj);
        System.out.println(user);


        Class[] clazz1 = list.toArray(new Class[0]);
        Class[] clazz2 = (Class[]) obj.toArray(new Object[0]);
    }


}
