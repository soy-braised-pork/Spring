package com.zlx.easy.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringLife {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansTest.xml");
        TestEntity obj = (TestEntity) context.getBean("exampleBean");
        obj.setMsg("aaa");
        System.out.println(obj.getMsg());
        //hook 钩子   程序结束之后执行    关闭容器，销毁Bean，调用销毁方法
        context.registerShutdownHook();
    }
}
