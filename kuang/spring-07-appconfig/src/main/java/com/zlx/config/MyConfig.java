package com.zlx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */


@Configuration //被spring托管，注册到容器中 == component
//代表这是一个配置类，和bean.xml是一样的
public class MyConfig {

    @Bean //相当于bean标签
    //方法名=id   返回值=class属性
//    public User getUser(){
      public User user(){
        return new User();  //就是返回到要注入到bean的对象
    }
}
