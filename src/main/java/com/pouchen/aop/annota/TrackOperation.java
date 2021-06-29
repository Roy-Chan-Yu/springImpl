package com.pouchen.aop.annota;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	@AfterReturning(pointcut = "execution(* Operation.*(..))",  
            returning= "result")
	
	public void myadvice(JoinPoint jp, Object result) {
		System.out.println("additional concern");
		System.out.println("Method Signature: " +jp.getSignature());
		System.out.println("Result in advice: "+ result);
		System.out.println("End of after returning advice...");
	}
	
/*	
	public void k() {
		
	}
	public void m() {
		
	}
	
	@Before("k()")
	public void myadvice(JoinPoint jp) {
		System.out.println("before additional concern...");
	}
	@After("k()")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("after addtional concern...");
	}
*/
	
	
	
}
