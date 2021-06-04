package com.zlx.anno.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于     <bean id="user" class="com.zlx.anno.dao.User"/>
@Component //组件
@Scope("singleton")   //singleton 单例模式
public class User {

//    public String name = "zlx";

    @Value("哈哈哈")
    public String name;

}
