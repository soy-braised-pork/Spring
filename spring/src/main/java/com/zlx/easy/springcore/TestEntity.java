package com.zlx.easy.springcore;

import org.springframework.beans.factory.annotation.Value;

public class TestEntity {

    @Value("122")   //赋值
    private String msg;

    public TestEntity(String s) {
    }

    public TestEntity() {

    }


    public String getMsg() {
        return msg;
    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }

//    public TestEntity(String msg) {
//        this.msg = msg;
//    }

    public void init() {
        System.out.println("TestEntity被创建啦");
    }

    public void destory() {
        System.out.println("TestEntity被销毁啦");
    }

    public void setMsg(String msg) {
    }
}
