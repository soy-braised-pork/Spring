package com.zlx.easy.springcore;

public class TestEntity {

    private String msg;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void init(){
        System.out.println("TestEntity被创建啦");
    }

    public void destory(){
        System.out.println("TestEntity被销毁啦");
    }
}
