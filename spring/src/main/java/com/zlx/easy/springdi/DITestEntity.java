package com.zlx.easy.springdi;

public class DITestEntity {

    private DIEntity diEntity;


    public DIEntity getDiEntity() {
        System.out.println("aaaaaaaaa");
        System.out.println("aaa");
        System.out.println("aaaaaaa");
        return diEntity;
    }

    public void setDiEntity(DIEntity diEntity) {
        System.out.println("set DIEntity");
        this.diEntity = diEntity;
    }
}
