package com.zlx.demo1;

public class ClientProxy {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理  中介帮房东租房子
        Proxy proxy = new Proxy(host);
        //自己直接向中介租房子
        proxy.rent();

    }
}
