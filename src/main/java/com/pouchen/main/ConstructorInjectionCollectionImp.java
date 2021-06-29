package com.pouchen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Question;

public class ConstructorInjectionCollectionImp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question question = (Question)context.getBean("questionbean");
		question.displayInfo();
	}

}
