package com.zlx.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这个注解的意思，就说明这个类被spring接管了，注册到了容器里
@Component
public class User {
    private int age;

    public int getAge() {
        return age;
    }

    @Value("12")  //属性注入
    public void setAge(int age) {
        this.age = age;
    }


    private String name;



    public String getName() {
        return name;
    }

    @Value("zlx")
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
