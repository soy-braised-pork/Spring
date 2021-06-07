package com.zlx.easy.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AnnotationTestMain {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Student student = context.getBean("student", Student.class);
        student.getClazz().clazzPrint();
    }
}
