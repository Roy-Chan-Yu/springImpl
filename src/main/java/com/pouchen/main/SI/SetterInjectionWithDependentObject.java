package com.pouchen.main.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Employee;
import com.pouchen.dto.Question;

public class SetterInjectionWithDependentObject {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee)context.getBean("empSI");
		e.show();
		
		System.out.println("--------------------");
		Question q = (Question)context.getBean("quesSI");
		q.displayInfo();
		
		
		
	}

}
