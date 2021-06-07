package com.zlx.aop.service.impl;

import com.zlx.aop.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加啦");
    }

    @Override
    public void delete() {
        System.out.println("删除啦");
    }

    @Override
    public void update() {
        System.out.println("更新啦");
    }
}
