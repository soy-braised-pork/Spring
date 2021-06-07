package com.zlx.aop.annotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    //切入点
    @Before("execution(* com.zlx.aop.service.impl.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.zlx.aop.service.impl.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.zlx.aop.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();   //执行方法
        System.out.println("环绕后");


        Signature signature = jp.getSignature(); //获得签名
        System.out.println("signatrue:" + signature);


    }
}
