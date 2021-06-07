package com.zlx.proxy.demo01;

public class Proxy implements Rent {

    @Override
    public void rent() {
        System.out.println("中介出租房子");
    }

    @Override
    public void watch() {
        System.out.println("中介带租客去看房");
    }
}
