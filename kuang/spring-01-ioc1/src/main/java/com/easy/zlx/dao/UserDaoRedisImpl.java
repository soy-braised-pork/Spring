package com.easy.zlx.dao;

public class UserDaoRedisImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Redis接收数据");
    }
}
