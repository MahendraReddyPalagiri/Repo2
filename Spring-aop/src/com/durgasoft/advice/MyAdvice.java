package com.durgasoft.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAdvice  {
 @Before("execution(* com.durgasoft.dao.TransactionDao.*(..))")
 public void before(JoinPoint jp) {
	 System.out.println("Reading the card Details before"+jp.getSignature().getName());
 }
 @After("execution(* com.durgasoft.dao.TransactionDao.*(..))")
 public void after(JoinPoint jp) {
	 System.out.println("Trnsction Success"+jp.getSignature().getName());
 }
 @Around("execution(* com.durgasoft.dao.TransactionDao.*(..))")
 public void around(ProceedingJoinPoint jp) {
	 System.out.println("mahendra");
	 try {
		jp.proceed();
	} catch (Throwable e) {
		e.printStackTrace();
	}
	 System.out.println("Dhoni");
 }
}