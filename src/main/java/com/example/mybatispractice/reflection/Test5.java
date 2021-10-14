package com.example.mybatispractice.reflection;

import com.example.mybatispractice.model.Pepople;
import com.example.mybatispractice.model.Student;
import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/12 11:18
 * @Description:
 */
public class Test5 {

    public static void main(String[] args) throws NoSuchMethodException {
        //获取方法的放回类型
        Type type = TypeParameterResolver.resolveReturnType(Pepople.class.getMethod("getReturn",null), Pepople.class);
        System.out.println();


        //获取方法的返回类型
        Type type2 = TypeParameterResolver.resolveReturnType(Pepople.class.getMethod("getReturn",null), Student.class);
        System.out.println();

        //Method method = User.class.getMethod("getValidate",new Class[]{String.class,Integer.class});
        Method method = Student.class.getMethod("getReturn",null);
        //获取方法请求参数 类型列表
        Type[] types = TypeParameterResolver.resolveParamTypes(method,Student.class);
        System.out.println();
    }
}
