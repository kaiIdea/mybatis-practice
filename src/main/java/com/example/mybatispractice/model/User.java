package com.example.mybatispractice.model;

import com.example.mybatispractice.annotations.Login;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 15:53
 * @Description:
 */
@Data
public class User {
    private String userName;
    private String telePhone;
    private String address;
    private Integer age;


    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public User(String userName, String telePhone) {
        this.userName = userName;
        this.telePhone = telePhone;
    }

    public boolean getValidate(String userName,Integer age){
        if(null != userName && null != age){
            return true;
        }
        return false;
    }

    public void checkUser(@Param("userId") String userId,String passWord, @Param("userName")String userName){
        System.out.printf("******************************userId");
    }
}
