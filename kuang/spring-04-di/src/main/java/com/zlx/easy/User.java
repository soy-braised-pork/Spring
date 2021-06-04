package com.zlx.easy;

public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.age = age;
        this.username = username;
    }

    public User(){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
