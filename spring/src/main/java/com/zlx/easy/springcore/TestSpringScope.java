package com.zlx.easy.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringScope {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansTest.xml");
        TestEntity testEntity = (TestEntity) context.getBean("testEntity");
        testEntity.setMsg("Object A");
        System.out.println(testEntity.getMsg());

        TestEntity testEntity1 = (TestEntity) context.getBean("testEntity1");
        System.out.println(testEntity1.getMsg());

        System.out.println(testEntity == testEntity1);
    }
}
