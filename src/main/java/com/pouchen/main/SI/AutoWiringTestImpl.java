package com.pouchen.main.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pouchen.dto.Print3D;

public class AutoWiringTestImpl {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Print3D print3d = context.getBean("print3d", Print3D.class);
		print3d.display();
	}

}
