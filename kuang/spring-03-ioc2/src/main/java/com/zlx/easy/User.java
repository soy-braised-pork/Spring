package com.zlx.easy;

public class User {
    private String name;

//    //使用无参构造创建对象，默认
//    public User(){
//        System.out.println("User的无参构造！");
//    }

    //使用有参构造创建对象
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("name="+name);
    }
}
