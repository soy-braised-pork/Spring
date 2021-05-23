package com.zlx.easy.springannotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.zlx.easy.springannotation")
public class BeanConfig {
//
//    //依赖第三方jar包   Person被移到别的包
//    @Bean
//    public Person person(){
//        return new Person();
//    }
}
