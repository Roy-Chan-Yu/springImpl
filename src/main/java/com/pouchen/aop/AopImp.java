package com.pouchen.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopImp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Advice advice = context.getBean("proxy", Advice.class);
		
		System.out.println("proxy class Name："+ advice.getClass().getName());
		advice.m();
		
		Validator validator = context.getBean("valid", Validator.class);
		try {
			validator.validate(10);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
