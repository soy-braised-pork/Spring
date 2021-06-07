package com.zlx.easy.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("BeansTest.xml");

        TestEntity testEntity = context.getBean("testEntity", TestEntity.class);

//        testEntity.setMsg("sss");

        System.out.println(testEntity.getMsg());
    }
}
