package com.example.mybatispractice.reflection;

import com.example.mybatispractice.model.User;
import org.apache.ibatis.reflection.invoker.GetFieldInvoker;
import org.apache.ibatis.reflection.invoker.Invoker;
import org.apache.ibatis.reflection.invoker.MethodInvoker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 16:32
 * @Description:
 */
public class Test2 {

    public static void main(String[] args) throws NoSuchMethodException {
        User user = new User("keke");
        Invoker field = new GetFieldInvoker(User.class.getDeclaredFields()[0]);
        try {
            Object obj = field.invoke(user,null);
            System.out.println();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        User user1 = new User("keke",88);
        Method method = User.class.getMethod("getValidate",new Class[]{String.class,Integer.class});
        Invoker methodInvoker = new MethodInvoker(method);
        try {
            method.invoke(user1,new Object[]{"keke",88});
            System.out.println();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
