package com.example.mybatispractice.type;

import com.example.mybatispractice.model.Student;
import com.example.mybatispractice.model.User;
import org.apache.ibatis.type.TypeException;
import org.apache.ibatis.type.TypeReference;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/14 17:31
 * @Description:
 */
public class Test1 {


    public static void main(String[] args) {
        getSuperclassTypeParameter(new Student().getClass());
    }

    static Type getSuperclassTypeParameter(Class<?> clazz) {
        Type genericSuperclass = clazz.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            if (TypeReference.class != genericSuperclass) {
                return getSuperclassTypeParameter(clazz.getSuperclass());
            } else {
                throw new TypeException("'" + User.class + "' extends TypeReference but misses the type parameter. Remove the extension or add a type parameter to it.");
            }
        } else {
            Type rawType = ((ParameterizedType)genericSuperclass).getActualTypeArguments()[0];
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType)rawType).getRawType();
            }

            return rawType;
        }
    }
}
