package com.zlx.easy.annocation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatinMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationTest.xml");
        Company company = context.getBean("company", Company.class);
        company.getUserName();
    }
}
