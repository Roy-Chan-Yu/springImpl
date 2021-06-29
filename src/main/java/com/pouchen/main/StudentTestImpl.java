package com.pouchen.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Students;

public class StudentTestImpl {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Students students = (Students)factory.getBean("studentbean");
		students.displayInfo();
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Students std2 = (Students) context.getBean("studentbean");
			std2.displayInfo();
		}
		
		
		
		
		
		
	}

}
