package com.pouchen.aop.annota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAopImp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.getBean("opBean").getClass());
		Operation op = (com.pouchen.aop.annota.Operation)context.getBean("opBean");
		System.out.println("Call msg()...");
		op.msg();
		System.out.println("Call m()...");
		op.m();
		System.out.println("Call k()...");
		op.k();
		
	}

}
