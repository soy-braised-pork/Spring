package com.zlx.easy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class People {

    //在属性、set方式上使用
    @Autowired  //不需要get set
    private Cat cat;

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
