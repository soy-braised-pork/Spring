package com.zlx.easy;

public class People {

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
