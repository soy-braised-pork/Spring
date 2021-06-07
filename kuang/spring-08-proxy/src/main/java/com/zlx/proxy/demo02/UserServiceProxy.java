package com.zlx.proxy.demo02;

public class UserServiceProxy implements UserService{


    private UserServiceImpl userServiceImpl;


    public void setUserServiceImpl(UserServiceImpl userServiceImpl){
        this.userServiceImpl=userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delect() {
        log("delect");
    }

    @Override
    public void select() {
        log("select");
    }


    //日志方法
    public void log(String msg){
        System.out.println("[DeBug]  使用了"+msg+"方法");
    }
}
