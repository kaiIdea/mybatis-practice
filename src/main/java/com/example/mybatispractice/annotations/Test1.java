package com.example.mybatispractice.annotations;

import com.alibaba.fastjson.JSON;
import com.example.mybatispractice.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.reflection.ParamNameResolver;
import org.apache.ibatis.session.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/12 18:04
 * @Description:
 */
public class Test1 {


    public static void main(String[] args) throws NoSuchMethodException {
        Method method = User.class.getMethod("checkUser",new Class[]{String.class,String.class,String.class});
        Annotation[][] paramAnnotations = method.getParameterAnnotations();
        int paramCount = paramAnnotations.length;
        SortedMap<Integer, String> map = new TreeMap();
        for(int paramIndex = 0; paramIndex < paramCount; ++paramIndex) {
            String name = null;
            Annotation[] var9 = paramAnnotations[paramIndex];
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                Annotation annotation = var9[var11];
                if (annotation instanceof Param) {
                    name = ((Param)annotation).value();
                    break;
                }
            }

            if (name == null) {
                if (name == null) {
                    name = String.valueOf(map.size());
                }
            }

            map.put(paramIndex, name);
        }





//        String array = JSON.toJSONString(paramAnnotations);
//        System.out.printf("");
//        ParamNameResolver resolver = new ParamNameResolver(new Configuration(),method);
//        System.out.printf("");
    }
}
