package com.zlx.easy.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    //依赖注入
    @Autowired
    private Clazz clazz;


    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void clazzPrint() {
        clazz.clazzPrint();
    }
}
