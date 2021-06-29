package com.pouchen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Address;

public class ConstructorDefaultValueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address address = (Address)context.getBean("addressbean");
		address.show();
		
	}

}
