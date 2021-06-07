package com.zlx.proxy.demo01;

public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        Proxy proxy = new Proxy();
        proxy.rent();
        proxy.watch();
    }
}
