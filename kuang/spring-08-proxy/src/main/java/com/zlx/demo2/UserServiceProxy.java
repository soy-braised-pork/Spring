package com.zlx.demo2;

public class UserServiceProxy implements UserService{

    private User user;


    public void setUserService(User user){
        this.userService=userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delect() {
        userService.delect();
    }

    @Override
    public void select() {
        userService.select();
    }
}
