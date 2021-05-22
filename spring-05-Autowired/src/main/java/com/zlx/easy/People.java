package com.zlx.easy;

import org.springframework.beans.factory.annotation.Autowired;

public class People {

    //在类
    @Autowired
    private Cat cat;

    private Dog dog;

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
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
