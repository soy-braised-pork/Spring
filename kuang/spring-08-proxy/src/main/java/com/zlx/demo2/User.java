package com.zlx.demo2;

public class User implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一条消息");
    }

    @Override
    public void delect() {
        System.out.println("删除了一条消息");
    }

    @Override
    public void select() {
        System.out.println("查找了一条消息");
    }
}
