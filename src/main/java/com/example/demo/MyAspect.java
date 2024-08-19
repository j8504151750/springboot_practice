package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(* com.example.demo.HpPrinter.*(..))")
//    public void before() {
//        System.out.println("I'm in before advice.");
//    }
//
//    @After("execution(* com.example.demo.HpPrinter.*(..))")
//    public void after() {
//        System.out.println("I'm in after advice.");
//    }
    @Around("execution(* com.example.demo.HpPrinter.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Date start = new Date();

        Object result = joinPoint.proceed();

        Date end = new Date();
        long executionTime = end.getTime() - start.getTime();
        System.out.println("Execution time: " + executionTime + " ms");
        return result;

    }

}
