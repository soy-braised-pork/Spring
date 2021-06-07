package com.zlx.proxy.demo02;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加啦~");
    }

    @Override
    public void delect() {
        System.out.println("删除啦~");
    }

    @Override
    public void select() {
        System.out.println("查找啦~");
    }
}
