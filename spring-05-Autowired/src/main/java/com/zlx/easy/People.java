package com.zlx.easy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {

    /**
     * 自动装配
     * 如果@Autowired自动装配的环境比较复杂，自动装配无法通过@Autowired完成的时候，
     * 使用@Qualifier(value="xxx")去配置@Autowired的使用，指定一个唯一的bean对象注入
     */
    //在属性、set方式上使用
    //不需要get set
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    @Autowired(required = false)
    @Qualifier(value = "cat11")
    private Cat cat;

    //java
    //先通过名字去查找，名字找不到再适配类型，最后不行就报错
    @Resource
    private Dog dog;

    private String name;


    //@Nullable 标记字段，此字段可以为空
//    public People(@Nullable String name){
//        this.name=name;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }


    @Override
    public String toString() {
        return "People{" +
                "Cat='" + cat + '\'' +
                ", Dog='" + dog + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
