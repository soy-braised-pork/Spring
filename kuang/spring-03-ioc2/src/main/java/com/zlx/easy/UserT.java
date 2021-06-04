package com.zlx.easy;

public class UserT {
    private String name;

    //使用无参构造创建对象，默认
    public UserT(){
        System.out.println("UserT的无参构造！");
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

