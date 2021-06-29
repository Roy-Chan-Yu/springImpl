package com.pouchen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Employee;

public class AggregationTestImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee)context.getBean("emp");
		e.show();
	}

}
