package com.zlx.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        watch();
        host.rent();
    }

    //看房
    public void watch(){
        System.out.println("中介带看房~");
    }
}
