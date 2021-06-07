package com.zlx.easy.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DIBeansTest.xml");

        DITestEntity diTestEntity = context.getBean("diTestEntity", DITestEntity.class);
        diTestEntity.getDiEntity();

        DIEntity diEntity = context.getBean("diEntity", DIEntity.class);
        diEntity.print();


    }
}
