package com.example.mybatispractice.reflection;

import com.example.mybatispractice.model.User;
import org.apache.ibatis.reflection.property.PropertyCopier;
import org.apache.ibatis.reflection.property.PropertyNamer;
import org.apache.ibatis.reflection.property.PropertyTokenizer;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 17:12
 * @Description:
 */
public class Test3 {

    public static void main(String[] args) {
        User user1 = new User("dada",88);
        User user2 = new User("keke");

        PropertyCopier.copyBeanProperties(User.class,user1,user2);


        String aa = PropertyNamer.methodToProperty("getUserName");

        PropertyTokenizer propertyTokenizer = new PropertyTokenizer("user[id].userName");
        System.out.println(user2);
    }
}
