package com.easy.archiecture.springaop.aopannotation;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AopTest {
    @Pointcut("execution(* com.easy.archiecture.springaop.aopannotation..*.*(..))")
    private void any0ldTransfer() {
    }


    @Before("com.easy.archiecture.springaop.aopannotation.AopTest.any0ldTransfer()")

    //@After()
    //@Around()
    private void addBeforePrint() {
        System.out.println("add--before");
    }
}
